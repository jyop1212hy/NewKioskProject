package example.kiosk.lv1kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //입력 처리와 간단한 흐름 제어를 복습합니다. (프로그래밍 검증**)**
        //'Scanner` 활용법, 조건문, 반복문을 재확인하며 입력 데이터를 처리하는 방법 강화
        //Scanner를 사용하여 여러 햄버거 메뉴를 입렵받고 출력합니다.

        String menu1 = "1. ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        String menu2 = "2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        String menu3 = "3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        String menu4 = "4. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거";
        String menu5 = "0. 종료 | 종료 |";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]\n" + menu1 + "\n" + menu2 + "\n" + menu3 + "\n" + menu4 + "\n" + menu5);

            int menunumber = scanner.nextInt();
            scanner.nextLine();

            //반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료합니다.
            if (menunumber == 0) {
                System.out.println("안녕히가세요.");
                break;

                //제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
            } else {

                switch (menunumber) {
                    case 1:
                        System.out.println(menu1 + "\n");
                        break;

                    case 2:
                        System.out.println(menu2 + "\n");
                        break;

                    case 3:
                        System.out.println(menu3 + "\n");
                        break;

                    case 4:
                        System.out.println(menu4 + "\n");
                        break;

                    default:
                        System.out.println("올바른 번호를 입력하세요.\n");
                        break;
                }
            }
        }
    }
}
