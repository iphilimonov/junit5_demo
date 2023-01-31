package cases;

import org.junit.jupiter.api.*;

/**
 * @author : Ivan Filimonov
 * @since : 31.01.2023, 17:36
 **/
public class Test1
{
    @Test
    public void test11()
    {
        System.out.println("TEST11");
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void test12()
    {
        System.out.println("TEST22");

        Assertions.assertEquals(1, 1);
    }
}
