// Gets a String from user
// Converts the String to lowercase, and
// displays the String's length
// as well as a count of letters
import java.util.Scanner; //hello Scanner my old friend
public class DebugSeven4
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String aString ;
int numLetters = 0;
int stringLength;
System.out.println("Enter a String. Include");
System.out.println("some uppercase letters, lowercase");
System.out.print("letters, and numbers >> ");
aString = kb.nextLine();
stringLength = aString.length();
System.out.print("In all lowercase, the String is: ");
for(int i = 0; i < stringLength; i++)// < in place of <= because <= makes an out of bounds exception .___.
{
char ch = Character.toLowerCase(aString.charAt(i));
System.out.print(ch);
if(!Character.isLetter(ch))
numLetters++;
}
System.out.println();
System.out.println
("The number of CHARACTERS in the string is " + stringLength);
System.out.println("The number of LETTERS is " + numLetters); //unclosed string literal and added a space at is for clarity in the output lol
}
}
