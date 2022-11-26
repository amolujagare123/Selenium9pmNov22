package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

       driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
       // driver.findElement(By.xpath("//a[@href='add_customer.php']")).click();

        WebElement txtName = driver.findElement(By.xpath("//input[@name='name']"));
        txtName.sendKeys("Anuja1234");

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 =  driver.findElement(By.xpath("//input[@name='contact1']"));
        txtContact1.sendKeys("787878878");

        WebElement txtContact2 =  driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("187878878");

        driver.findElement(By.xpath("//input[@value='Add']")).click();

    }
}
