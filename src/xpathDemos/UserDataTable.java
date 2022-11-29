package xpathDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDataTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://openclinic.sourceforge.net/openclinic/admin/staff_list.php");

        //tr[td[text()='Galaxy']]/td/a/img[@title='edit']

        String name = "Fabiana";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//img[@title='edit']")).click();


    }
}
