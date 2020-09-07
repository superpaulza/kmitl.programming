import java.util.*;
public class AgeHeartRate {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your age ==> ");
        int age = input.nextInt();
        System.out.print("Please input your current Heartrate (times/min.) ==> ");
        int hr = input.nextInt();
        
        //Calculate Heartrate (times/age)
        int sum = hr*60*24*365*age;

        //Print Calculated your heatrate
        System.out.println("Your lifetime Heartrate Pulse is " + sum + " times");
    }
}    