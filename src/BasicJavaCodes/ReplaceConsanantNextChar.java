package BasicJavaCodes;

import java.util.Scanner;

public class ReplaceConsanantNextChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(replaceConsonantwithNextChar(str));
    }

    private static String replaceConsonantwithNextChar(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                continue;
            }
            arr[i] += 1;
        }
        String ans = new String(arr);
        return ans;
    }
}
