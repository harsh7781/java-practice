package OOP;
import java.util.*;

//Normal Interface ->  two or more methods
//Functional/SAM Interface -> one method which is functional
//SAM - Single Abstract method Interface
//Marker Interface -> No methods, blank interface (used in serialization).

@java.lang.FunctionalInterface
interface FunctionalInterface {
    void showMovies(String movieName);
}

//class Demo implements FunctionalInterface {
//
//    public void showMovies() {
//        System.out.println("Which movie you want to see");
//    }
//}

public class InterfaceTypes {
    public static void main(String[] args) {
//        FunctionalInterface obj = new FunctionalInterface() {
//            public void showMovies() {
//                System.out.println("Movies");
//            }
//        };
//        obj.showMovies();

//        //Lambda expression
//        FunctionalInterface obj = () ->  {
//                System.out.println("Movies");
//            }
//        ;
//        obj.showMovies();

        //Lambda expression
//        FunctionalInterface obj = (String movieName) -> System.out.println("Movie : " + movieName);
//        obj.showMovies("Interstellar");

        FunctionalInterface obj = movieName -> System.out.println("Movie : " + movieName);
        obj.showMovies("Interstellar");
    }
}
