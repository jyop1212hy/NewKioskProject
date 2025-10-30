package example.kiosk.lv5kiosk;

public class MenuItem {

    //속성
    private String name;
    private String description;
    private double price;

    //생성자
    MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
