package BasicJavaCodes;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        System.out.println("Enter the traffic light color");
        Scanner sc = new Scanner(System.in);
        String color = sc.next().toLowerCase();
        switch(color) {
            case "red" :
                System.out.println("Stop!!!!");
                break;
            case "yellow" :
                System.out.println("Ready!!!!");
                break;
            case "green" :
                System.out.println("Go!!!!");
                break;
            default:
                System.out.println("Enjoy the ride !!!!");
        }
    }
}
