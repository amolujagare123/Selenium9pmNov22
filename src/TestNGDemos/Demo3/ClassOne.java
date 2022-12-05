package TestNGDemos.Demo3;

import org.testng.annotations.*;

public class ClassOne {

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
    public void classOneTest1()
    {
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
