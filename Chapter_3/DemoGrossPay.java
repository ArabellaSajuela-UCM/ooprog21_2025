//import java.util.Scanner;
public class DemoGrossPay {
private static final double hourly_rate = 22.75;
public static void main (String[] args) {

//Scanner s = new Scanner(System.in);
//System.out.println("Enter");

calculateGross(5.20);
calculateGross(14.3);
calculateGross(18.63);

   }
public static void calculateGross(double hoursWorked) {
double grossPay = hoursWorked * hourly_rate;
System.out.println(hoursWorked + " hours at " + hourly_rate + " is equivalent to " + grossPay);
   } 
}

//cannot upload to github because I am not the author.____.