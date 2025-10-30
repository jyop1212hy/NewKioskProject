package example.kiosk.lv5kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //속성
    private List<String> categoryList = new ArrayList<>();
    private List<List<MenuItem>> menuItems;

    //생성자
    public Menu(List<String> categoryName, List<List<MenuItem>> menuItems) {
        this.categoryList = categoryName;
        this.menuItems = menuItems;
    }

    //아이템 메뉴 리스트
    public List<List<MenuItem>> getMenuItems() {
        return this.menuItems;
    }

    //카테고리 리스트
    public void printCategoryList() {
        for (int i = 0; i < categoryList.size(); i++)
            System.out.println(categoryList.get(i));
        //return this.categoryList = categoryList;
    }

    //아이템 메뉴 리스트
    public void showItemMenu(int number) {
        List<MenuItem> selectedList = menuItems.get(number - 1);
        //  %d (번호), %-18s (이름), %.1f (가격), %s (설명)
        String format = "%d. %-15s | W %.1f | %s%n";
        for (int i = 0; i < selectedList.size(); i++) {
            MenuItem itenum = selectedList.get(i);
            System.out.printf(format, i + 1,
                                    itenum.getName(),
                                    itenum.getPrice(),
                                    itenum.getDescription()
            );
        }
        System.out.println("0.   뒤로가기 ");
    }

    //선택한 아이템
    public void showChoseItem(int categoryNumber, int itemNumber) {
        List<MenuItem> selectedList = menuItems.get(categoryNumber - 1);
        String format = "%-5s | W %.1f | %s%n";
        System.out.print("선택한 메뉴: ");
        System.out.printf(format,
                        selectedList.get(itemNumber - 1).getName(),
                        selectedList.get(itemNumber - 1).getPrice(),
                        selectedList.get(itemNumber - 1).getDescription()
        );
    }
}