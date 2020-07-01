package test;


import org.junit.*;
import project.logic.Calculation;
import project.logic.UserDetails;

import static junit.framework.Assert.assertEquals;


public class CalculationTest {

    Calculation calculation=new Calculation();
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4,  calculation.findMax(new int[]{1,3,4,2}));
    }
    @Test
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27, calculation.cube(3));
    }

    //TODO : 1. Add test case for reverseWord function of Calculation (2 marks)
    @Test
    public void testreverseWord(){
        System.out.println("Test Case ReverseWord");
        assertEquals("pegec ", calculation.reverseWord("cegep"));
    }

   
    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }

}