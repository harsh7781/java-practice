package Collections;

import java.util.ArrayList;
import java.util.List;

public class BasicList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(7);
        arr.add(5);
        arr.add(9);

        System.out.println(arr.indexOf(7));
        System.out.println(arr.get(3));
    }
}
