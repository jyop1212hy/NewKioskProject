package example.kiosk.lv4kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //햄버거 메뉴 리스트
        List<MenuItem> burgerMenuItems = new ArrayList<>();
        burgerMenuItems.add(new MenuItem("🪖군대리아","이등병은 먹을수 없습니다", 15.0));
        burgerMenuItems.add(new MenuItem("🧽게살버거","네모네모 스펀지밥이 만들어주는 햄버거", 20.0));
        burgerMenuItems.add(new MenuItem("🧀치즈버거","중국산 치즈가 들어간 치즈버거", 10.0));
        burgerMenuItems.add(new MenuItem("🏃🏻공갈버거  ","다이어트에 최고 식품", 36.0));

        //음료 메뉴 리스트
        List<MenuItem> drinksMenuItems = new ArrayList<>();
        drinksMenuItems.add(new MenuItem("🥛우유","갓 만든 우유", 5.0));
        drinksMenuItems.add(new MenuItem("🥤콜라","콜라는 노제로", 4.0));
        drinksMenuItems.add(new MenuItem("🧉환타","오렌지맛 콜라", 2.0));
        drinksMenuItems.add(new MenuItem("🍶공갈콜라","다이어트 최고", 8.0));

        //디저트 메뉴 리스트
        List<MenuItem> dessertsmenuItems = new ArrayList<>();
        dessertsmenuItems.add(new MenuItem("🥮건빵튀김","군인들의 소울푸드", 10.0));
        dessertsmenuItems.add(new MenuItem("🐟생선튀김","소금팍팍 뿌린 생선구이", 20.0));
        dessertsmenuItems.add(new MenuItem("🍟감자튀김","중국산 수입 감자 사용", 330.0));
        dessertsmenuItems.add(new MenuItem("🥠공갈튀김","다이어트 최고의 관식", 40.0));

        //메뉴 클래스 인스턴스
        Menu menu = new Menu(burgerMenuItems,drinksMenuItems,dessertsmenuItems); //인자: 햄버거 메뉴, 카테도리 텍스트

        //키오스크 클래스 인스턴스
        Kiosk menuItemsList = new Kiosk(menu);
        //Kiosk 클래스의 start함수 호출
        menuItemsList.start();
        }
    }
