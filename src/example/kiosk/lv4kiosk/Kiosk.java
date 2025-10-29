package example.kiosk.lv4kiosk;

import java.util.Scanner;

public class Kiosk {
    //설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.

    //속성
    public Menu menuItemsList;
    Scanner scanner;

    //생성자
    Kiosk(Menu menuItems) {
        this.menuItemsList = menuItems;
        this.scanner = new Scanner(System.in);
    }

    //문자 입력 필터링
    public int filteredInputDevice(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("\n‼️가만 있어봐 그니까 지금 글자로 주문을 하고싶은겨~??\n많이 급한가~? ⬆️위에 0번 보이제~?\n");
            }
        }
    }

    //기능
    //키오스크 시작 메서드
    public void start() {

        while (true) {
            // 1) 카테고리 메뉴리스트 출력
            menuItemsList.getCategoryList();

            try {
                // 2) 카테고리 메뉴 선택
                int filteredInput = filteredInputDevice("메뉴를 입력해 주세요: ");

                //프로그햄 종료
                if (filteredInput == 0) {
                    System.out.println("🙋🏼🙋🏻‍♀️🙋🏽‍♂️ 이~~ 그려 멀리 안가니께 잘가~.");
                    scanner.close(); //입력 콘솔 제서
                    break;
                } else if (1 <= filteredInput || filteredInput <= menuItemsList.categoryList.size()) {
                    while (filteredInput != 0) {
                        switch (filteredInput) {

                            //햄버거 메뉴
                            case 1:
                                menuItemsList.getBurgerMenuItemsList();
                                int burgersMenuInput = filteredInputDevice("번호를 입력해 주세요: ");
                                System.out.println("\n" + menuItemsList.burgerMenuItems.get(burgersMenuInput - 1).name + "\n");
                                break;

                            //음료수 메뉴
                            case 2:
                                menuItemsList.getDrinksMenuItemsList();
                                int beverageMenuInputDevice = filteredInputDevice("번호를 입력해 주세요: ");
                                System.out.println("\n" + menuItemsList.burgerMenuItems.get(beverageMenuInputDevice - 1).name + "\n");
                                break;

                            //디저트 메뉴
                            case 3:
                                menuItemsList.getDessertsmenuItemsList();
                                int desserTmenuInputDevice = filteredInputDevice("번호를 입력해 주세요: ");
                                System.out.println("\n" + menuItemsList.burgerMenuItems.get(desserTmenuInputDevice - 1).name + "\n");
                                break;

                            //상세 메뉴 입력 오류 안내 문구
                            default:
                                System.out.println("️\n‼️️️가만 있어봐 그니까 그 많은양을 혼자 다먹는다는겨??\n저기 일단 짜장면 이라도 한그릇 먹고 와봐~\n");
                                break;
                            }
                        }

                    //카테고리 메뉴 숫자 입력 오류 안내문구
                    } else {
                        System.out.println("️\n‼️가만 있어봐~내눈에는 그런 메뉴가 안보이는데?\n손님 눈에는 그게 있는거 아녀?? 아이구야~\n");
                        break;
                    }

                    //상세 메뉴 숫자 오류 안내문구
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\n🤔📢뭐가 마음에 안드는겨????\n");
            }
        }
    }
}