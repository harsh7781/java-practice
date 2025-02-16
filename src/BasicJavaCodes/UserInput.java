package BasicJavaCodes;

import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");
//        int num = System.in.read(); //Reads ascii value
//        System.out.println("Ascii value is : " +  num);

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//
//        int n = Integer.parseInt(bf.readLine());
//        System.out.println(n);
//
//        bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // for Integer
        String s = sc.next(); //word.. will take input till space button is not pressed
        String l = sc.nextLine(); //String of words.. will take input till enter button is pressed
        char c = sc.next().charAt(0); // for char
        float f = sc.nextFloat(); //for float values
        double d = sc.nextDouble(); //for double values
        byte b = sc.nextByte(); //for byte values

        System.out.println(num + " " + s + " " + l + " " + c + " " + f + " " + d + " " + b);
        sc.close();
    }
}
