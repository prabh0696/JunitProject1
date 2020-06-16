package test;

import org.junit.Test;
import project.logic.ExceptionClass;

public class ExceptionClassTest {

    //TODO :2. Complete the test case to test IllegalArgumentException (2 marks)

    @Test
    public void testExceptionIsThrown() {
        ExceptionClass tester = new ExceptionClass();
        tester.multiply(999, 5);
    }

    //TODO :3. Complete the test case to test if the multiply function is giving correct answer or not ( 2 marks)
    @Test
    public void testMultiply() {

    }
}
