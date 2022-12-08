package ReportsDemo.ScreenshotDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void screenshotDemo() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");

        // 1. create the object reference of TakesScreenshot (ts)
        // assign current driver to it ,
        // type cast it into TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. using this object call the method getScreenshotAs()
        // store the value ( return by this method)
        // into a file object
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());
                // FDS PSD
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));

    }
}
