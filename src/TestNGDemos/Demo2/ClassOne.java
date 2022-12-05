package TestNGDemos.Demo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {


    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classOneTest1(String url,String username,String password)
    {
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

        System.out.println("classOneTest1");
    }

    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
