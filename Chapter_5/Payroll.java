import java.util.Scanner;

public class Payroll {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final double OVERTIME_MULTIPLIER = 1.5;
        
System.out.print("How many hours did you work this week? ");
double hours = input.nextDouble();
        
System.out.print("What is your regular pay rate? ");
double rate = input.nextDouble();
        
if (rate > 60.00) {
System.out.println("Pay rate cannot exceed 60.00");
return;
   }
double regularHours = Math.min(hours, 40);
double overtimeHours = Math.max(hours - 40, 0);
double regularPay = regularHours * rate;
double overtimePay = overtimeHours * rate * OVERTIME_MULTIPLIER;
System.out.printf("Regular pay is %.1f%n", regularPay);
System.out.printf("Overtime pay is %.1f%n", overtimePay);
input.close();
System.out.println("\n---jGRASP: Operation complete.");
    }
}