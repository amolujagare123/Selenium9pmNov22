package TestNGDemos.DemoReal;


import ReportsDemo.ExtentReportDemo.util.InitExitBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends InitExitBrowser {



    @Test
    public void naukri()
    {
        driver.get("http://naukri.com");

        Assert.assertEquals("my naukri",driver.getTitle(),"Wrong page");
    }

    @Test
    public void monster()
    {
        driver.get("http://monster.com");
    }

    @Test
    public void shine()
    {
        driver.get("http://shine.com");
    }

    @Test
    public void timesjobs()
    {
        driver.get("http://timesjobs.com");
    }


}
