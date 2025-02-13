package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EachCharPresentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many characters you want to enter: ");
        int n = sc.nextInt();
        char[] charArr = new char[n];
        for(int i = 0; i < n; i++) {
            charArr[i] = sc.next().charAt(0);
        }
        Map<Character, Integer> res = countEachChar(charArr);
        for(Map.Entry<Character, Integer> entry : res.entrySet()) {
            System.out.println("Character " + entry.getKey() + " occurred " + entry.getValue() + " times");
        }
    }

    private static Map<Character, Integer> countEachChar(char[] charArr) {
        Map<Character, Integer> count = new HashMap<>();
        for(char c: charArr) {
            if(count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            }
            else {
                count.put(c, 1);
            }
        }
        return count;
    }
}


