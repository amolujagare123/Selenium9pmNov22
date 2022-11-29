package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JobSiteDropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");


        WebElement jobRole = driver.findElement(By.xpath("//span[@id='select2-chosen-4']"));
        jobRole.click();
        driver.findElement(By.xpath("//li/div[contains(text(),'Database Architect')]")).click();
    }
}
