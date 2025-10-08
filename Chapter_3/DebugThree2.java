// This application displays some math facts
import java.util.Scanner;
public class DebugThree2
{
public static void main(String[] args) //??? can you place them([]) next to args????
{
int a, b, c;
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer >> ");
a = input.nextInt(); 
System.out.print("Enter a second integer >> ");
b = input.nextInt(); // b is not initialised
System.out.print("Enter a third integer >> ");
c = input.nextInt(); // c is not initialised
add(a, b);
add(b, c);
add(a, c);
subtract(a, b); //subtract is misspelled x3
subtract(b, c);
subtract(a, c);
}
public static int add(int a, int b)
{
System.out.println("The sum of " + a +
" and " + b + " is " + (a + b)); //added parentheses
return a + b; //missing return statement
}
public static int subtract(int a, int b) //void returns nothing so its changed to int
{
System.out.println("The difference between " +
a + " and "  + b + " is " + (a - b));
return a - b; //missing return statement
}
}

//cannot upload to github because I am not the author.____.
//I will upload at home