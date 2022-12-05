import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Pooja {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "https://www.flipkart.com/";
      /*  System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\21008\\OneDrive - Co\\Desktop\\pooja\\chromedriver_win32\\chromedriver.exe");
*/
        driver.get(URL);
        driver.findElement(By.xpath("//button[text()='✕']")).click();

        WebElement web = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        web.sendKeys("electronics");
        web.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='TVs & Appliances']"))).click();

        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//span[text()='TVs & Appliances']"))).perform();
        //want to print all the links text which is present under "tvs & appliances" dropdown

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      List<WebElement> list = driver.findElements(By.xpath("//a[@class='_3QN6WI _1MMnri _32YDvl']"));


        for (WebElement ele1 : list) {


            System.out.println(ele1.getText());


        }


    }

}
