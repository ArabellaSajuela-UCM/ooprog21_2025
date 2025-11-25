// Program accepts a String and displays some facts
import java.util.Scanner; //sigh incomplete call of library for Scanner
public class DebugSeven3
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String quote, charString;
char searchChar;
System.out.print("Enter a famous quote >> ");
quote = kb.nextLine(); //missing Scanner
System.out.print("Enter a character to search for >> ");
charString = kb.nextLine(); //cannot convert from String to int methinks
searchChar = charString.charAt(0);
System.out.println("index of ('" + searchChar + "') is: " +
quote.indexOf(searchChar)); //missing )
System.out.println("indexOf('a') is: " + quote.indexOf('a')); //missing ( and )
System.out.println("indexOf('x') is: " + quote.indexOf('x'));
System.out.println("charAt(5) is: " + quote.charAt(5));
System.out.println("replace('e', '*') is: " +
quote.replace('e', '*')); //extra p 
}
}


//good for censoring some words and some are hilarious