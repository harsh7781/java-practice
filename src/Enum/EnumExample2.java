package Enum;

enum Laptops {
    Macbook(2000), XPS(2200), Surface, Thinkpad(150);
    private int price;

    Laptops() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Laptops(int price) {
        this.price = price;
        System.out.println("In Laptop: " + this.name());
    }
}

public class EnumExample2 {
    public static void main(String[] args) {
        Laptops lap = Laptops.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        for(Laptops lappies : Laptops.values()) {
            System.out.println(lappies + " : " + lappies.getPrice());
        }
    }
}
