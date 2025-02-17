package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harshal", "Arjoo", "Chayna", "Shefali");
        //Gives only first name
        Optional<String> name = names.stream()
                .filter(str -> str.contains("r"))
                .findFirst();

        String name1 = names.stream()
                .filter(str -> str.contains("r"))
                .findFirst()
                .orElse("Not Found");


        System.out.println(name.orElse("Not Found"));
    }
}
