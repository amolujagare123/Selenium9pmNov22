package TestNGDemos.StockManagement;

import ReportsDemo.ExtentReportDemo.util.InitExitBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook extends InitExitBrowser {


    @Test
    public void fbTestForgotPassword()
    {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Forgotten password?")).click();

        String expected = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook";

        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void createUserTest()
    {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();

    }
}
