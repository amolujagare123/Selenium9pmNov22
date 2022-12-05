package TestNGDemos.Demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classTwoTest1(String url,String username,String password)
    {
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        System.out.println("classTwoTest1");
    }
    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Parameters("myOs")
    @Test
    public void classTwoTest3(String os)
    {
        System.out.println(os);
        System.out.println("classTwoTest3");
    }
}
