package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo4 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();
        //WebDriver driver = new InternetExplorerDriver();

        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        System.out.println(driver.getPageSource());


    }
}
