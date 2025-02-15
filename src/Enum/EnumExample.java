package Enum;

enum Status{
    pending, running, submitted, success;
}

public class EnumExample {
    public static void main(String[] args) {
        Status[] ss = Status.values();
        for(Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
            if(s == Status.pending) {
                System.out.println(s.getClass().getSuperclass());
                System.out.println("Pending.. Try Again");
            }
        }
    }

}
