package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeException {
    public static void validateAge(int age) throws AgeExceptionClass {
        if(age <= 15) throw new AgeExceptionClass("Age should be greater than 15!!");
        else System.out.println("Age is valid");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input!! Please enter  a valid number");
        }
        catch (AgeExceptionClass e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
