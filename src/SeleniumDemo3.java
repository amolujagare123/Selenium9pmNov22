import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class SeleniumDemo3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://facebook.com");

        System.out.println(driver.getTitle());

        ArrayList<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(0));

        System.out.println(driver.getTitle());

    }
}
