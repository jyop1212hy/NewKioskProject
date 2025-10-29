package example.kiosk.lv3kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.

    //속성
    public List<MenuItem> menuItems;

    //생성자
    Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // Scanner 선언
    Scanner scanner = new Scanner(System.in);

    //기능
    public void start() {
        while (true) {

            // 1) 햄버거 메뉴리스트 출력
            System.out.println("[ 🍔 60년 전통 햄버거 맛집 👍 ]");
            for (int i = 0; i < menuItems.size(); i++)
                System.out.printf((i + 1) + ", " + "%-5s  | %-3s | %-3s%n", menuItems.get(i).menuItemName, menuItems.get(i).menuItemPrice, menuItems.get(i).menuItemDescription);
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            // 2) 숫자 입력 받기 - 문자 입력 예외처리
            try {
                String input = scanner.nextLine();
                int FilteringInput = Integer.parseInt(input);

                // 3) if (프로그램을 종료) / else (선택한 메뉴 출력)
//                if (1 <= FilteringInput && FilteringInput <= menuItems.size()) {
                  if (FilteringInput == 0){
                    System.out.println("🙋🏼🙋🏻‍♀️🙋🏽‍♂️ 이~ 그려 멀리 안가니께 잘가~.");
                    break;

                } else {

                    // 4) 선택한 메뉴 출력
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
                                System.out.println("🤔📢혼자 그만큼 다 먹는다고? 집에 돼지 키우는겨??\n");
                    }
                }

            // 2-1) 예외 처리된 문자입력 안내문구
            } catch (Exception e) {
                System.out.println("\n🤔📢0~4까지 눈에 안보이는겨?\n");
            }
        }
    }
}