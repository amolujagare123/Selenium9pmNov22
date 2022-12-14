package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginDataProviderEx {

    @Test (dataProvider = "getData")
    public void loginTest(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }


    @DataProvider
    public Object[][] getData() throws IOException {

        // 1. read the file
        FileInputStream fileInputStream = new FileInputStream("Data/myData.xls");

        // 2. convert this file object into a workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        // 3. identify the sheet where the data is
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        // 4. count the active row
        int rowCount = sheet.getPhysicalNumberOfRows(); // 5

        //int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][2];

        for (int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

           // HSSFCell cell = row.getCell(0);

            data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();

        }

        return data;

        /*data[0][0] = "admin";
        data[0][1] = "admin";

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";

        data[2][0] = "";
        data[2][1] = "";

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";*/


    }
}
