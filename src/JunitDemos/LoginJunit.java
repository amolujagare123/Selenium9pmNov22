package JunitDemos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJunit {

    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();
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
    public void loginTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("sdsd");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsdsd");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void loginTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }
}
