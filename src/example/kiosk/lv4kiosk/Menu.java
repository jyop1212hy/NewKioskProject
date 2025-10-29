package example.kiosk.lv4kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //속성
    List<String> categoryList;
    List<MenuItem> burgerMenuItems;
    List<MenuItem> drinksMenuItems;
    List<MenuItem> dessertsmenuItems;

    //생성자
    public Menu(List<MenuItem> burgerMenuItems,
                List<MenuItem> drinksMenuItems,
                List<MenuItem> dessertsmenuItems) {
        this.burgerMenuItems = burgerMenuItems;
        this.drinksMenuItems = drinksMenuItems;
        this.dessertsmenuItems = dessertsmenuItems;
    }

    //카테고리 리스트
    public List<String> getCategoryList() {
        List<String> categoryList = new ArrayList<>();
        categoryList.add("[ MAIN MENU ]");
        categoryList.add("1. Burgers");
        categoryList.add("2. Drinks");
        categoryList.add("3. Desserts");
        categoryList.add("0. 종료 | 종료 |");
        for (int i = 0; i < categoryList.size(); i++)
            System.out.println(categoryList.get(i));
        return this.categoryList = categoryList;
    }

    //햄버거 메뉴 리스트
    public void getBurgerMenuItemsList() {
        int num = 1;
        System.out.println("\n[ BURGERS MENU ]");
        //  %d (번호), %-18s (이름), %.1f (가격), %s (설명)
        String format = "%d. %-8s | W %.1f | %s%n";
        for (MenuItem showMeunItemList : burgerMenuItems) {
            System.out.printf(format, num++, showMeunItemList.name, showMeunItemList.price, showMeunItemList.description);
        }
        System.out.println("0. 뒤로가기");
    }

    //음료 메뉴 리스트
    public void getDrinksMenuItemsList() {
        int num = 1;
        System.out.println("\n[ DRINKS MENU ]");
        String format = "%d. %-8s | W %.1f | %s%n";
        for (MenuItem showMeunItemList : drinksMenuItems) {
            System.out.printf(format, num++, showMeunItemList.name, showMeunItemList.price, showMeunItemList.description);
        }
        System.out.println("0. 뒤로가기");
    }

    //디저트 메뉴 리스트
    public void getDessertsmenuItemsList() {
        int num = 1;
        System.out.println("\n[ DESSERTS MENU ]");
        String format = "%d. %-8s | W %.1f | %s%n";
        for (MenuItem showMeunItemList : dessertsmenuItems) {
            System.out.printf(format, num++, showMeunItemList.name, showMeunItemList.price, showMeunItemList.description);
        }
        System.out.println("0. 뒤로가기");
    }
}

