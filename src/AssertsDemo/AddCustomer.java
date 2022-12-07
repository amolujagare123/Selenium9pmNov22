package AssertsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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


    @Test
    public void addCustomerTest1()
    {

        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cust")).click();

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("Anuja123");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 =  driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("787878878");

        WebElement txtContact2 =  driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("187878878");

        driver.findElement(By.name("Submit")).click();

        String expected = "Dublicat Entry. Please Verify";
        String actual = "";

        try {
            actual = driver.findElement(By.cssSelector("[class*=box]")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public void addCustomerTest2()
    {


        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cust")).click();

        String name = "Anuja125";

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 =  driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("787878878");

        WebElement txtContact2 =  driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("187878878");

        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";
        String actual = "";

        try {
            actual = driver.findElement(By.cssSelector("[class*=box]")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }
}
