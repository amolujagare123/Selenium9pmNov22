package TestNGDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTestNG3 {

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
    public void loginTest1()
    {

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
     //   btnLogin.click();
    }

    @Test
    public void loginTest2()
    {

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("gfgf");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("gfgfg");

        WebElement btnLogin = driver.findElement(By.name("submit"));
     //   btnLogin.click();
    }

    @Test
    public void loginTest3()
    {

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();
    }
}
