//PROVIDED BY: JONATHAN LUZINCOURT
//EMAIL: jluzinc000@citymail.cuny.edu

import java.util.Scanner;
import java.util.Calendar;

public class TestHeartRates{
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //created an object to HeartRates and assigned it to myHealth
        HeartRates myHealth = new HeartRates();
        //object to Calendar to get the current year
        Calendar cal = Calendar.getInstance();
        int k = cal.get(Calendar.YEAR);
        
        //Prompt to get the user to input their first name
        System.out.print("Person's First Name: ");
        String first = input.nextLine();
        //stores the input into the object for HeartRates
        myHealth.setfName(first);
        
        //Prompt to get the user to input their last name
        System.out.print("Person's Last Name: ");
        String last = input.nextLine();
        //stores the input into the object for HeartRates
        myHealth.setlName(last);
        
        //Prompt to get the user to input their birth year
        System.out.print("Person's Year of birth: ");
        int birthY = input.nextInt();
        //stores the input into the object for HeartRates
        myHealth.setOld(birthY);
        
        //Prints out formatted inputs using string specifiers
        System.out.printf("First Name: %s%n", first);
        System.out.printf("Last Name: %s%n", last);
        
        //formula to get the age of user and formatted to print value
        int age = k - birthY;
        System.out.printf("Age: %d%n", age);
        
        //formula to get the heart rate and formatted to print value
        int maxHeartRate = 220 - age;
        System.out.printf("Maximum Heart Rate: %d%n", maxHeartRate);
        
        //Used double to get float value of 50 - 85% of max heart rate
        double targetMin = maxHeartRate * 0.50;
        double targetMax = maxHeartRate * 0.85; 

        //prints out min and max value and formatted to print the rounded value
         System.out.printf("Target heart rate range: %.0f", targetMin);
         System.out.printf(" - %.0f", targetMax);
    }
}