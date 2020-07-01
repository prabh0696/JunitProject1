package project.logic;

import project.logic.model.User;

public class UserDetails {

    // TODO :4. Write function to display full name of user (2 marks)
    public static String FullName(User user){
        String fullName=user.getfName()+" "+user.getlName();

        return fullName;
    }


    //TODO :5. Write function to set Verify if the user belongs
    // to Canada ( Address of user is canadian)  -( 3 marks)
    // Assume that the country string will consider CA,US,IN etc.
    public static Boolean VerifyCountry(User user){
        String country=user.getAddress().getCountry();
        if(country=="CA"){
            return true;
        }
        else {
            return false;
        }
    }

    //TODO :6. Write function to calculate amount user will accumulate by age of 55.
    // Logic to be considered : imagine if user has salary 10000 per year and age is 30 then
    // the total amount that will be accumulated will be 25*salary per year.
    // Also consider that each year user gets 2% hike -( 3 marks)
    public static Double SalaryAccumulated(User user){
        int remainingAge=55-user.getAge();
        double salaryHike=0,totalSalary=0;
        salaryHike=user.getSalary();
        for(int i=1;i<=remainingAge;i++){
            salaryHike=salaryHike+salaryHike*0.02 ;
            totalSalary+=salaryHike;
        }
        return totalSalary;
    }
}
