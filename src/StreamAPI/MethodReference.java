package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harshal", "Surya", "Yash");

//        List<String> uNames = names.stream()
//                .map(name -> name.toUpperCase())
//                .toList();

        List<String> uNames = names.stream()
                .map(String::toUpperCase)  //Method reference
                .toList();

        //uNames.forEach(i -> System.out.println(i));
        uNames.forEach(System.out::println); //Method reference
        System.out.println(uNames);
    }
}
