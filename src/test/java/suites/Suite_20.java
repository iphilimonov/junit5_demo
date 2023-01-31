package suites;

import cases.*;
import org.junit.platform.suite.api.*;

/**
 * @author : Ivan Filimonov
 * @since : 31.01.2023, 17:36
 **/

@Suite
@SelectClasses({
        Test1.class,
        Test2.class,
})
public class Suite_20
{
    public static final byte CASE_NUMBER = 20;
}