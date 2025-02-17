package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,2,6,3);

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                if(n % 2 == 0) return true;
                return false;
            }
        };

        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
            public Integer apply(Integer n) {
                return n * 2;
            }
        };
        //Function<Integer, Integer> fun = n -> n * 2;


        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c,e) -> c + e);
        System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sortedValues.forEach(n -> System.out.println(n));

    }
}
