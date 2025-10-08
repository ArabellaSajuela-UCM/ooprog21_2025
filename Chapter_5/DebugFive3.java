// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class DebugFive3
{
public static void main (String args[])
{
int item;
String output;
final int LOW = 111;
final int HIGH = 999;
final int CUTOFF = 500;
Scanner input = new Scanner(System.in);
System.out.print("Please enter item number >> ");
item = input.nextInt();
if(item < LOW) { //from > to <
output = "Item number too low";
} //no proper encapsulation of the logic body aka uhh no parenthesis to hold the logic body
else if(item > HIGH) { //improper spacing, misspelling, and changed from >= to >
output = "Item number too high";
} //same here
else if(item == CUTOFF) { //improper spacing and no logic body
output = "Valid - Item in Automotive Department";
}
else {//no logic body again
output = "Valid - Item in Housewares Department";
}
System.out.println(output);
}
}