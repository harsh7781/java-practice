package BasicJavaCodes;

import java.util.Scanner;

public class DiffOfSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int square_sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            square_sum += (i * i);
        }
        System.out.println(sum);
        System.out.println(square_sum);
        int sumOfSquare =  sum * sum;
        System.out.println(square_sum - sumOfSquare);
    }
}
