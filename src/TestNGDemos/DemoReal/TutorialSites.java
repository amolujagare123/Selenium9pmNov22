package TestNGDemos.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites {

    WebDriver driver;
    @BeforeClass // this method will run before first test method of the class
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass  // this method will run after last test method of the class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

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
        driver.get("http://javatpoint.com");
    }




}
