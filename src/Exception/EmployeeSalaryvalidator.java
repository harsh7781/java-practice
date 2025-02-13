package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeSalaryvalidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter employee salary in Rs: ");
            int salary = sc.nextInt();
            checkSalary(salary);
        }
        catch (InputMismatchException e) {
            System.out.println("Salary should be of Integer value!!");
        }
        catch (SalaryException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }

    private static void checkSalary(int salary) throws SalaryException{
        if(salary < 3000) throw new SalaryException("Impossible!! You need to find another job :(");
        else System.out.println("Your salary is: " + salary);
    }
}
