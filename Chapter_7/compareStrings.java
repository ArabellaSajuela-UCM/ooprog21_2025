import java.util.Scanner;

public class compareStrings {

public static void main (String[] args){
Scanner s = new Scanner(System.in);
String yourname;
final String name = "Carmen"; 

System.out.println("Enter your name > "); 
yourname = s.nextLine();

if(yourname.equals(name)) {
System.out.println(yourname + " equals " + name);
}
else{
System.out.println(yourname + " does not equal " + name);
}
s.close();
}
}