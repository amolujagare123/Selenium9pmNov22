package DataProvider;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddCustomer {

    WebDriver driver;

    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }


    @Test (dataProvider = "getData")
    public void addCustomerTest(String name,String address,String contact1,String contact2)
    {

        driver.findElement(By.linkText("Add Customer")).click();

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys(address);

        WebElement txtContact1 =  driver.findElement(By.name("contact1"));
        txtContact1.sendKeys(contact1);

        WebElement txtContact2 =  driver.findElement(By.name("contact2"));
        txtContact2.sendKeys(contact2);

        driver.findElement(By.name("Submit")).click();

    }


    @DataProvider
    public  Object[][] getData() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("Data/myDataX.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Add Customer");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0;i<rowCount-1 ; i++)
        {
            XSSFRow row = sheet.getRow(i+1);

            for (int j=0;j<colCount ; j++) {

                XSSFCell cell = row.getCell(j);

                if (cell==null) { // if the cell is blank
                    data[i][j] = "";
                }
                else {
                    cell.setCellType(CellType.STRING); // convert the cell type to String
                    data[i][j] = cell.toString();
                }

            }

            /*data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();
            data[i][2] = row.getCell(2).toString();
            data[i][3] = row.getCell(3).toString();*/
        }

        return data;
    }
}
