package BasicJavaCodes;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DiffBetwenCurrDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD): ");
        String str = sc.nextLine();
        LocalDate userDate = LocalDate.parse(str);
        LocalDate currDate = LocalDate.now();
        printDuration(userDate, currDate);
    }

    private static void printDuration(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("Duration from " + startDate + " to " + endDate + ":");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
