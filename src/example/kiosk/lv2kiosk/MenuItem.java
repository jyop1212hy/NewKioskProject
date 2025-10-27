package example.kiosk.lv2kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    //설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
    //클래스는 이름, 가격, 설명 필드를 갖습니다.

    //main 함수에서 MenuItem 클래스를 활용하여 햄버거 메뉴를 출력합니다.
    //MenuItem 객체 생성을 통해 이름, 가격, 설명을 세팅합니다.
    //List를 선언하여 여러 MenuItem을 추가합니다.
    //List<MenuItem> menuItems = new ArrayList<>();
    //반복문을 활용해 menuItems를 탐색하면서 하나씩 접근합니다.

    //속성
    public String menuItemName;
    public String menuItemDescription;
    public double menuItemPrice;

    //생성자
    MenuItem(String menuItemName, String menuItemDescription, double menuItemPrice){
    this.menuItemDescription = menuItemDescription;
    this.menuItemName = menuItemName;
    this.menuItemPrice = menuItemPrice;
    }

    //기능





    // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
    // (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)

    // Scanner 선언

    // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
    // 숫자를 입력 받기
    // 입력된 숫자에 따른 처리
    // 프로그램을 종료
    // 선택한 메뉴 : 이름, 가격, 설명
}
