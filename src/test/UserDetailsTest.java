package test;

import org.junit.Test;
import project.logic.UserDetails;
import project.logic.model.Address;
import project.logic.model.User;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class UserDetailsTest {
    User user=new User();
    Address address=new Address();
    //TODO :7. Write Test Case for function FullName() (2marks)
    @Test
    public void testFullName(){
        user.setfName("James");
        user.setlName("Brown");
        System.out.println("Test Case FullName");
        assertEquals("James Brown", UserDetails.FullName(user));
    }


    //TODO :8. Write TestCase for function VerifyCountry() (3marks)
    @Test
    public void testVerifyCountry(){
        address.setStreetName("Bishop");
        address.setCity("Montreal");
        address.setProvince("Quebec");
        address.setCountry("CA");
        user.setAddress(address);
        System.out.println("Test Case VerifyCountry");
        assertTrue(UserDetails.VerifyCountry(user));
    }

    //TODO :9. Write TestCase for function SalaryAccumulated() (3marks)
    @Test
    public void testSalaryAccumulated(){
        user.setSalary(10000.0);
        user.setAge(53);
        System.out.println("Test Case SalaryAccumulated");
        assertEquals(20604.0, UserDetails.SalaryAccumulated(user));
    }

}
