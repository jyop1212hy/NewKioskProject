package example.kiosk.lv2kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        //List<MenuItem>chickenMenuItem = new ArrayList<>(List.of(new MenuItem("1. 양념치킨","치킨의 원조",2.0)));
        List<MenuItem>chickenMenuItem = new ArrayList<>();
        MenuItem chickenMenuItem1 = new MenuItem("1. 군대리아","이등병은 먹을수 없습니다.", 15.0);
        MenuItem chickenMenuItem2 = new MenuItem("2. 게살버거","네모네모 스펀지밥이 만들어주는 햄버거", 20.0);
        MenuItem chickenMenuItem3 = new MenuItem("3. 치즈버거","중국산 치즈가 들어간 치즈버서 입니다..", 10.0);
        MenuItem chickenMenuItem4 = new MenuItem("4. 공갈버거","다이어트에 최고 입니다..", 36.0);
        chickenMenuItem.add(chickenMenuItem1);
        chickenMenuItem.add(chickenMenuItem2);
        chickenMenuItem.add(chickenMenuItem3);
        chickenMenuItem.add(chickenMenuItem4);

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            System.out.println("[ 🍗 닭 학살자 🐓 ]");
            for (MenuItem chickenMenuItems : chickenMenuItem)
                //포맷팅 형식 출력
                System.out.printf("%-5s  | %-3s | %-3s%n", chickenMenuItems.menuItemName , chickenMenuItems.menuItemPrice , chickenMenuItems.menuItemDescription);
                System.out.println("0. 종료");
                System.out.print("메뉴를 선택해주세요: ");

            // 숫자를 입력 받기
            int menunumber = scanner.nextInt();
            scanner.nextLine();

            // 프로그램을 종료
            if (menunumber == 0) {
                System.out.println("안녕히가세요.");
                break;

                // 입력된 숫자에 따른 처리
            } else if (menunumber != 0) {

                // 선택한 메뉴 : 이름, 가격, 설명
                switch (menunumber) {
                    case 1:
                        System.out.println("\n" + chickenMenuItem.get(0).menuItemName + "\n");
                        break;

                    case 2:
                        System.out.println("\n" + chickenMenuItem.get(1).menuItemName + "\n");
                        break;

                    case 3:
                        System.out.println("\n" + chickenMenuItem.get(1).menuItemName + "\n");
                        break;

                    case 4:
                        System.out.println("\n" + chickenMenuItem.get(1).menuItemName + "\n");
                        break;

                    default:
                        System.out.println("올바른 번호를 입력하세요.\n");
                        break;
                }
            } else {
                scanner.close();
                break;

            }
        }
    }
}
