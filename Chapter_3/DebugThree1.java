// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
public class DebugThree1
{
public static void main(String[] args) //switched brackets -1
{
double check1;
double check2;
Scanner input = new Scanner(System.in);
System.out.print("Enter the amount of your check >> ");
check1 = input.nextDouble(); //variable was Int -2
System.out.print("Enter the amount of your friend's check >> ");
check2 = input.nextDouble(); //variable was Int -2.1 and missing a (.)
calcTip(check1);
calcTip(check2);
}
public static double calcTip(double bill) //parameter returns void - changed it to double and added bill as parameter -3
{
final double RATE = 0.15; //double is misspelled -4
double tip;
tip = bill * RATE; //changed it to * -5
System.out.println("The tip should be at least $" + tip);
return tip; //missing return statement
}
}

//cannot upload to github because I am not the author.____.
//will upload at home