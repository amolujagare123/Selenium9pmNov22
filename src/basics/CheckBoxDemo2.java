package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample/");

        WebElement java = driver.findElement(By.id("check0"));
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement cucumber = driver.findElement(By.id("check2"));

        Thread.sleep(4000);

        if (java.isSelected())
            java.click();

        Thread.sleep(4000);

        if (!selenium.isSelected())
            selenium.click();


        Thread.sleep(4000);

        if (cucumber.isSelected())
            cucumber.click();
    }
}
