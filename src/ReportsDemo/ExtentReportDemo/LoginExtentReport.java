package ReportsDemo.ExtentReportDemo;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ReportsDemo.ExtentReportDemo.util.ForExtentReport.getScreenshot;

public class LoginExtentReport {

    ExtentReports extent;
    @BeforeClass
    public void initExtentReportObj()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Testing");
        reporter.config().setDocumentTitle("Stock Management system");

        extent.setSystemInfo("Project Name","Stock Management system" );
        extent.setSystemInfo("Developers Name","Priyanka" );
        extent.setSystemInfo("Testers Name","Anuja" );
        extent.setSystemInfo("Team size","12" );
        extent.setSystemInfo("Project Deadline","Dec End" );
    }
    @AfterClass
    public void writeToReport()
    {
        extent.flush(); // write to report
    }

    @Test
    public void loginTest1() throws IOException {
        ExtentTest test = extent.createTest("valid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("Browser is opened and it is maximized");

        driver.get("https://stock.amolujagare.com/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("Username is set");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        test.info("Password is set");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");


        try {

            Assert.assertEquals(driver.getTitle(),
                    "POSNIC - Dashboard",
                    "This is not a dashboard");

            test.pass("This test is passed");

        }
        catch (AssertionError e)
        {
            test.fail("This test is failed:"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }

    }

    @Test
    public void loginTest2()
    {
        ExtentTest test = extent.createTest("invalid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("Browser is opened and it is maximized");

        driver.get("https://stock.amolujagare.com/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("invalid Username is set");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("invalid Password is set");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");


    }

    @Test
    public void loginTest3()
    {
        ExtentTest test = extent.createTest("blank valid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("Browser is opened and it is maximized");

        driver.get("https://stock.amolujagare.com/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("blank Username is set");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("blank Password is set");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");


    }



}
