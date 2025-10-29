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
    public int filteredInputDevice() {
        while (true) {
            System.out.print("번호 입력: ");
            String input = scanner.nextLine();
            try {
                int filteredInput = Integer.parseInt(input);
                return filteredInput;
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
                int filteredInput = filteredInputDevice();

                //프로그햄 종료
                if (filteredInput == 0) {
                    System.out.println("🙋🏼🙋🏻‍♀️🙋🏽‍♂️ 이~~ 그려 멀리 안가니께 잘가~.");
                    scanner.close(); //입력 콘솔 제서
                    break;

                } else if (1 <= filteredInput && filteredInput <= menuItemsList.categoryList.size() - 1) {
                    //입력 값이 길이 1,2,3에 해당 된다면 반복하고 그게 아니면 반복을 종료한다.
                    while (filteredInput <= menuItemsList.categoryList.size()) {
                        switch (filteredInput) {

                            //햄버거 메뉴
                            case 1 -> {
                                while (true) {
                                    menuItemsList.getBurgerMenuItemsList();
                                    int burgersMenuInput = filteredInputDevice();
                                    System.out.printf("선택한 메뉴는: " + menuItemsList.burgerMenuItems.get(burgersMenuInput - 1).name + "  |  " +
                                            menuItemsList.burgerMenuItems.get(burgersMenuInput - 1).price + "  |  " +
                                            menuItemsList.burgerMenuItems.get(burgersMenuInput - 1).description
                                    );
                                    break;
                                }
                            }

                            //음료수 메뉴
                            case 2 -> {
                                while (filteredInput != menuItemsList.categoryList.size()) {
                                    menuItemsList.getDrinksMenuItemsList();
                                    int drinksInputDevice = filteredInputDevice();
                                    System.out.println("선택한 메뉴는: " + menuItemsList.burgerMenuItems.get(drinksInputDevice - 1).name + "  |  " +
                                            menuItemsList.burgerMenuItems.get(drinksInputDevice - 1).price + "  |  " +
                                            menuItemsList.burgerMenuItems.get(drinksInputDevice - 1).description
                                    );
                                    break;
                                }
                            }


                            //디저트 메뉴
                            case 3 -> {
                                while (filteredInput != menuItemsList.categoryList.size()) {
                                    menuItemsList.getDessertsmenuItemsList();
                                    int desserTmenuInputDevice = filteredInputDevice();
                                    System.out.println("선택한 메뉴는: " + menuItemsList.burgerMenuItems.get(desserTmenuInputDevice - 1).name + "  |  " +
                                            menuItemsList.burgerMenuItems.get(desserTmenuInputDevice - 1).price + "  |  " +
                                            menuItemsList.burgerMenuItems.get(desserTmenuInputDevice - 1).description
                                    );
                                    break;
                                }
                            }
                        }
                    }
                //메뉴 입력 오류 안내 문구 (메뉴번호 외의 숫자 입력의 경우)
                } else {
                    System.out.println("️\n‼️이이~~??\n‼️가만있어봐~ 그게 손님 눈에는 그게 있는거여~? 다시 봐바~\n");
                }

            //그 외 오류 처리
            } catch (IndexOutOfBoundsException e) {
                scanner.nextLine();
                System.out.println("\n‼️이이~~??\n‼️키보드가 성난겨???\n다시 처음부터 차근차근 자알 혀봐~");
            }
        }
    }
}