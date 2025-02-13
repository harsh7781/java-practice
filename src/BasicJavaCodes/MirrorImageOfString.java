package BasicJavaCodes;

import java.util.Scanner;

public class MirrorImageOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(mirrorImage(str));
        System.out.println(mirrorImage1(str));
        System.out.println(mirrorImage2(str));
    }

    private static String mirrorImage2(String str) {
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        String rev = new String(arr);
        return str.toUpperCase()+"|"+rev.toUpperCase();
    }

    private static String mirrorImage1(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString().toUpperCase();
        return str.toUpperCase()+"|"+rev;
    }

    private static String mirrorImage(String str) {
        StringBuffer sf = new StringBuffer(str);
        String rev = sf.reverse().toString().toUpperCase();
        return str.toUpperCase()+"|"+rev;
    }
}
