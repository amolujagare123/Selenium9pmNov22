package TestNGDemos.Demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classThreeTest1(String url,String username,String password)
    {
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        System.out.println("classThreeTest1");
    }
    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
