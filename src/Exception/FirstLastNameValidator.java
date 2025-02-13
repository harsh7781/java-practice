package Exception;

import java.util.Scanner;

public class FirstLastNameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first name: ");
            String firstName = sc.nextLine();
            System.out.println("Enter last name: ");
            String lastName = sc.nextLine();
            validateFirstLastName(firstName, lastName);
        }
        catch(NameException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }

    private static void validateFirstLastName(String firstName, String lastName) throws NameException{
        if(firstName.isBlank() || lastName.isBlank()) {
            throw new NameException("First or last name should not be empty!! Please review the names");
        }
        else{
            System.out.println("First Name: " + firstName + "\nLast Name: " + lastName);
        }
    }


}
