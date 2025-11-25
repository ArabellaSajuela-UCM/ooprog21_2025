import java.util.Scanner;

public class BankBalance {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  double balance;
  double interest = 0.03; // default 3% interest rate
  int year = 1;
  int choice;

  System.out.print("Enter initial bank balance > ");
  balance = input.nextDouble();

  System.out.println("Do you want to see next year's balance?");
  System.out.print("Enter 1 for yes  or any other number for no >> ");
  choice = input.nextInt();

  while (choice == 1) {
    balance = balance + balance * interest;
    System.out.println("After year " + year + " at " + interest + " interest rate, balance is $" + balance);

    year++;
    System.out.println("\nDo you want to see the balance at the end of another year?");
    System.out.print("Enter 1 for yes  or any other number for no >> ");
    choice = input.nextInt();
  }
  input.close();
}
}
