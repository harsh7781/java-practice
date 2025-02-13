package Collections;

import java.util.*;

public class VotersList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of voters ");
        int n = sc.nextInt();
        Map<String, Integer> persons = new HashMap<>();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter ID of a person " + (i + 1) + " :");
            String id =  sc.next();

            System.out.println("Enter Age of a person " + (i + 1) + " :");
            Integer age =  sc.nextInt();

            persons.put(id, age);
        }

        List<String> result = getVoterList(persons);

        System.out.println("Following voters are eligible for vote: \n" + result);

    }

    private static List<String> getVoterList(Map<String, Integer> persons) {
        List<String> voterList = new ArrayList<>();
        for(String id : persons.keySet()) {
            int age = persons.get(id);
            if(age > 18) voterList.add(id);
        }
        return voterList;
    }
}
