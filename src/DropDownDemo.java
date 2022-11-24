import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample/");

        // 1. find the element
        WebElement textList = driver.findElement(By.id("seltext"));

        // 2. create the object of the select class
        Select selTextList = new Select(textList);

        Thread.sleep(4000);
        // 3. select the option
        //selTextList.selectByVisibleText("text 2");
        //selTextList.selectByIndex(2);
        selTextList.selectByValue("v12");

    }
}
