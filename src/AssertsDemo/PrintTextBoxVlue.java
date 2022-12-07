package AssertsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintTextBoxVlue {

    @Test
    public void myTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample");

        String textBoxText = driver.findElement(By.id("name")).getAttribute("value");

        System.out.println("textBoxText = "+textBoxText);
    }
}
