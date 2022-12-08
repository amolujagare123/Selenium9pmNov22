package ReportsDemo.ScreenshotDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo2 {

    @Test
    public void screenshotDemo() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@name='submit']"));
        WebElement lnkForgotPass = driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']"));

        WebElement loginForm =driver.findElement(By.xpath("//form[@id='login-form']"));

        // 1. using web element call the method getScreenshotAs()
        // store the value ( return by this method)
        // into a file object
        File srcFile = loginForm.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());  // FDS PSD
        String fileName = "IMG"+timeStamp+".png";

        // 2. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));

    }
}
