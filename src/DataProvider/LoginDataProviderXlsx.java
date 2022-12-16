package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginDataProviderXlsx {

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
        FileInputStream fileInputStream = new FileInputStream("Data/myDataX.xlsx");

        // 2. convert this file object into a workbook object
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // 3. identify the sheet where the data is
        XSSFSheet sheet = workbook.getSheet("Sheet2");

        // 4. count the active row
        int rowCount = sheet.getPhysicalNumberOfRows(); // 5

        //int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][2];

        for (int i=0;i<rowCount-1;i++)
        {
            XSSFRow row = sheet.getRow(i+1);

           // HSSFCell cell = row.getCell(0);
            data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();

        }

        return data;



    }
}
