package TestNGDemos.Demo3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","myUsername","myPassword"})
    @BeforeClass
    public void beforeMyClass(String url,String username,String password)
    {
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

        System.out.println("beforeMyClass");
    }

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }


    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
