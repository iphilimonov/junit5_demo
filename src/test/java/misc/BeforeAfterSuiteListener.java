package misc;

import org.junit.platform.launcher.*;

/**
 * @author : Ivan Filimonov
 * @since : 31.01.2023, 17:37
 **/
public class BeforeAfterSuiteListener implements TestExecutionListener
{

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan)
    {
        System.out.println("BEFORE");
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan)
    {
        System.out.println("AFTER");

    }
}