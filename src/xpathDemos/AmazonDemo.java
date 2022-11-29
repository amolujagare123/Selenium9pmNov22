package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/s?k=amol+ujagare");

        //driver.findElement(By.xpath("//img[@alt='Kick Start - Automation Testing: With no prior programming knowledge Learn Selenium with Java']")).click();
        driver.findElement(By.xpath("//img[contains(@alt,'Kick Start')]")).click();


    }
}
