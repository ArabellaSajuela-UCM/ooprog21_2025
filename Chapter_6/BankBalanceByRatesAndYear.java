import java.util.Scanner;
public class BankBalanceByRatesAndYear {
    
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter initial bank balance > ");
double initialBalance = input.nextDouble();

double[] interestRates = {0.02, 0.03, 0.04, 0.05};

for (int i = 0; i < interestRates.length; i++) {
double interest = interestRates[i];
double balance = initialBalance;

System.out.println("\nWith an initial balance of $" + initialBalance + " at an interest rate of " + interest);

for (int year = 1; year <= 4; year++) {
balance = balance + (balance * interest);
System.out.println("After year " + year + " balance is $" + balance);
}
}

input.close();
}
}