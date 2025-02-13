package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MedalsBasedOnMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number os Student: ");
        int n = sc.nextInt();
        Map<String, Integer> marks = new HashMap<>();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter Reg No. of student " + (i + 1) + " :");
            String regNo =  sc.next();

            System.out.println("Enter Marks of student " + (i + 1) + " :");
            Integer marksObtained =  sc.nextInt();

            marks.put(regNo, marksObtained);
        }

        Map<String, String> result = getStudentAndMedal(marks);

        for(Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println("Reg No : " + entry.getKey() + "\tMedal : " + entry.getValue() );
        }

    }

    private static Map<String, String> getStudentAndMedal(Map<String, Integer> marksMap) {
        Map<String, String> medalMap = new HashMap<>();
        for(String regNo : marksMap.keySet()) {
            int marks = marksMap.get(regNo);
            String medal = "";

            if (marks >= 90) {
                medal = "Gold";
            } else if (marks >= 80 && marks < 90) {
                medal = "Silver";
            } else if (marks >= 70 && marks < 80) {
                medal = "Bronze";
            }
            else medal = "No Medal";

            medalMap.put(regNo, medal);
        }
        return medalMap;
    }
}
