package TestNGDemos.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

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

    @Test (priority = 4)
    public void facebook()
    {
        driver.get("http://facebook.com");
    }
    @Test (priority = 1)
    public void twitter()
    {
        driver.get("http://twitter.com");
    }
    @Test (priority = 2)
    public void linkedIn()
    {
        driver.get("http://linkedin.com");
    }
    @Test (priority = 3)
    public void instagram()
    {
        driver.get("http://instagram.com");
    }

}
