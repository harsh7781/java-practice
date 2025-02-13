package BasicJavaCodes;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string containing numbers with space seperated: ");
        String str = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int sum = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println("Integer: " + number);
            sum += number;
        }
        System.out.println("Sum of all integers: " + sum);
    }
}
