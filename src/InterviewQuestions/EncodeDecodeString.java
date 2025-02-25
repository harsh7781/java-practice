package InterviewQuestions;
//LeetCode - 271

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EncodeDecodeString {

    private static List<String> decode(String s) {
        if(s.equals(Character.toString((char)258))) return new ArrayList<>();
        String seperate = Character.toString((char)257);
        return Arrays.asList(s.split(seperate, -1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        String encodedString = encodeString(strs);
        System.out.println("Encoded String : " + encodedString);
        List<String> decodedString = decode(encodedString);
        System.out.println(decodedString);
    }

    private static String encodeString(String[] strs) {
        if(strs.length == 0) {
            return Character.toString((char)258);
        }
        String seperate = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s);
            sb.append(seperate);
        }
        sb.deleteCharAt(sb.length()-1); // removing last additional char
        return sb.toString();
    }
}
