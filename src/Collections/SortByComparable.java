package Collections;
//Comparator - if you want to specify on which logic you want to compare
//Comparable - Give power to class to compare its object with itself
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student that) {
        if(this.age > that.age) return 1;
        return -1;
    }
}

public class SortByComparable {
    public static void main(String[] args) {

        Comparator<Integer> cmp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i % 10 > j % 10) return 1; //swap
                return -1;
            }
        };

        Comparator<Student> comp = (i, j) -> i.age > j.age ? 1 : -1;;

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        List<Student> stu = new ArrayList<>();
        stu.add(new Student(23, "Harshal"));
        stu.add(new Student(25, "Suryakant"));
        stu.add(new Student(24, "Pranjal"));
        stu.add(new Student(20, "Shrijal"));


        System.out.println("Sorting students based on their age using comparator");
        Collections.sort(stu, comp);
        for(Student s : stu) {
            System.out.println(s);
        }
        System.out.println("Sorting students based on their age using comparable");
        Collections.sort(stu);
        for(Student s : stu) {
            System.out.println(s);
        }
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("Sorting based on last digit");
        Collections.sort(nums, cmp);
        System.out.println(nums);
    }

}
