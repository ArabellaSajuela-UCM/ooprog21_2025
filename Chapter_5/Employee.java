/* 

The Employee class should contain these
following attributes: employee number, pay rate, 
max employee number (max is 9999), max rate (max is 60.00)
Alternatively the multiplier for Over-time rate is 1.5. 
The program should calculate and display the regular pay 
and overtime pay based on hours worked this week.

*/

public class Employee {

private int employeeNumber;
private double payRate;
private final int MAX_EMPLOYEE_NUMBER = 9999;
private final double MAX_RATE = 60.00;
private final double OVERTIME_MULTIPLIER = 1.5;
    
public Employee(int employeeNumber, double payRate) {
setEmployeeNumber(employeeNumber);
setPayRate(payRate);
    }

public int getEmployeeNumber() {
return employeeNumber;
    }
    
public void setEmployeeNumber(int employeeNumber) {
if (employeeNumber < 1 || employeeNumber > MAX_EMPLOYEE_NUMBER) {
throw new IllegalArgumentException("Employee number must be between 1 and " + MAX_EMPLOYEE_NUMBER)
   }
this.employeeNumber = employeeNumber;
    }
    
public double getPayRate() {
return payRate;
    }
    
public void setPayRate(double payRate) {
if (payRate < 0 || payRate > MAX_RATE) {
throw new IllegalArgumentException("Pay rate must be between 0 and " + MAX_RATE);
        }
this.payRate = payRate;
    }
    
public double[] calculatePay(double hoursWorked) {
double regularHours = Math.min(hoursWorked, 40);
double overtimeHours = Math.max(hoursWorked - 40, 0);
        
double regularPay = regularHours * payRate;
double overtimePay = overtimeHours * payRate * OVERTIME_MULTIPLIER;
        
return new double[]{regularPay, overtimePay};
    }
    
public int getMaxEmployeeNumber() {
return MAX_EMPLOYEE_NUMBER;
    }
    
public double getMaxRate() {
eturn MAX_RATE;
    }
}