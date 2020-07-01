package test;

import org.junit.Test;
import project.logic.ExceptionClass;

import static junit.framework.Assert.assertEquals;

public class ExceptionClassTest {

    //TODO :2. Complete the test case to test IllegalArgumentException (2 marks)
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        System.out.println("Test Case IllegalArgumentException");
        ExceptionClass tester = new ExceptionClass();
        tester.multiply(1000, 5);
    }

    //TODO :3. Complete the test case to test if the multiply function is
    // giving correct answer or not ( 2 marks)
    @Test
    public void testMultiply() {
        System.out.println("Test Case Multiply");
        assertEquals(199, ExceptionClass.multiply(999, 5));
    }
}
