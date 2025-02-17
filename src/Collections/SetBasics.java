package Collections;
//Set does not contain duplicates
// don't have index values, Not sorted
//For sorted values you can use TreeSet

import java.util.*;

public class SetBasics {
    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<Integer>();
        //Set<Integer> arr = new TreeSet<>(); // For Sorted values
        arr.add(3);
        arr.add(7);
        arr.add(5);
        arr.add(9);
        arr.add(5);
        arr.add(3);

        Iterator<Integer> values = arr.iterator();
        while (values.hasNext()) System.out.println(values.next());

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
