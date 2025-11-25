// Makes String comparisons
import java.util.Scanner; //missing Scanner
public class DebugSeven1
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String name1, name2, name3;
System.out.println("Enter three names.");
System.out.println("They can be the same or different.");
System.out.print("First name >> ");
name1 = kb.nextLine(); //missing ()
System.out.print("Second name >> ");
name2 = kb.nextLine(); //missing ()
System.out.print("Third name >> ");
name3 = kb.nextLine(); //missing ()
compareNames(name1, name2);
compareNames(name1, name3);
compareNames(name2, name3);
}
public static void compareNames(String name1, String name2) //incorrect String variable, misspelled compareNames,
{
System.out.print(name1 + " and " + name2); //same here 
if(name1.equals(name2)) { //missing ) 
System.out.println(" are the same");
}
else {
System.out.println(" are different");
} //missing { and } that constitute the body of the arguments of if and else 
} //thats about it methinks
}
