package example.kiosk.lv3kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //햄버거 메뉴 리스트
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("🪖군대리아","이등병은 먹을수 없습니다", 15.0));
        menuItems.add(new MenuItem("🧽게살버거","네모네모 스펀지밥이 만들어주는 햄버거", 20.0));
        menuItems.add(new MenuItem("🧀치즈버거","중국산 치즈가 들어간 치즈버거", 10.0));
        menuItems.add(new MenuItem("🏃🏻공갈버거","다이어트에 최고 식품", 36.0));
        //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
        Kiosk menuItemsList = new Kiosk(menuItems);

        //Kiosk 클래스의 start함수 호출
        menuItemsList.start();
        }
    }
