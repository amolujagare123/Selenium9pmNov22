package TestNGDemos.DemoReal;

import ReportsDemo.ExtentReportDemo.util.InitExitBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites  extends InitExitBrowser {



    @Test
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.com");
    }

    @Test
    public void w3schools()
    {
       // driver.get("http://w3schools.com");
    }

    @Test
    public void javatpoint()
    {
      //  driver.get("http://javatpoint.com");
    }




}
