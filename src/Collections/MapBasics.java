package Collections;
//Keys are unique
//Combination of set and lists
import java.util.HashMap;
import java.util.Map;

public class MapBasics {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Harshal", 86);
        students.put("Suryakant", 96);
        students.put("Yash", 68);
        students.put("Ishika", 90);
        students.put("Aviral", 59);
        students.put("Yash", 88);

        System.out.println(students);
        System.out.println(students.get("Yash"));
        System.out.println(students.keySet());

        for(String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
