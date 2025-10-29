package example.kiosk.lv4kiosk;

public class MenuItem {

    //속성
    public String name;
    public String description;
    public double price;

    //생성자
    MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
