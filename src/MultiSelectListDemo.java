import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample/");

        WebElement multiList = driver.findElement(By.id("multiSel"));
        Select selMultiList = new Select(multiList);

        Thread.sleep(4000);
        selMultiList.selectByVisibleText("text 1");

        Thread.sleep(4000);
        selMultiList.selectByIndex(2);

        Thread.sleep(4000);
        selMultiList.selectByIndex(3);

        Thread.sleep(4000);
        /*selMultiList.deselectByIndex(3);

        Thread.sleep(4000);
        selMultiList.deselectByIndex(2);

        Thread.sleep(4000);
        selMultiList.deselectByVisibleText("text 1");*/

        selMultiList.deselectAll();

    }


 }
