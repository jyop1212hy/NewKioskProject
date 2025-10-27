package example.kiosk.lv3kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.

    //속성
    //`MenuItem`을 관리하는 리스트가 필드로 존재합니다.
    public List<MenuItem> menuItems;

    //생성자
    Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // Scanner 선언
    Scanner scanner = new Scanner(System.in);

    //기능
    //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
    public void start() {
        System.out.println("[ 🍗 닭 학살자 🐓 ]");
        while (true) {
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            System.out.println("[ 🍗 닭 학살자 🐓 ]");
            for (int i = 0; i < menuItems.size(); i++)
                System.out.printf((i + 1) + ", " + "%-5s  | %-3s | %-3s%n", menuItems.get(i).menuItemName, menuItems.get(i).menuItemPrice, menuItems.get(i).menuItemDescription);
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            // 숫자를 입력 받기
            try {
                String input = scanner.nextLine();
                int FilteringInput = Integer.parseInt(input);
                //scanner.nextLine();

                // 프로그램을 종료
                if (FilteringInput == 0) {
                    System.out.println("안녕히가세요.");
                    break;

                    // 입력된 숫자에 따른 처리
                } else if (FilteringInput > 0 || FilteringInput > 5) {

                    // 선택한 메뉴 : 이름, 가격, 설명
                    switch (FilteringInput) {
                        case 1:
                            System.out.println(menuItems.get(0).menuItemName + "\n");
                            break;

                        case 2:
                            System.out.println(menuItems.get(1).menuItemName + "\n");
                            break;

                        case 3:
                            System.out.println(menuItems.get(2).menuItemName + "\n");
                            break;

                        case 4:
                            System.out.println(menuItems.get(3).menuItemName + "\n");
                            break;

                        default:
                            System.out.println("올바른 번호를 입력하세요.\n");
                    }

                } else {
                    System.out.println("잘못 입력 했씁니다.");
                }

            } catch (Exception e) {
                System.out.println("\n0~4까지 눈에 안보이는겨?\n");
            }

        }
    }
}