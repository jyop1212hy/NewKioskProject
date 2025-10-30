package example.kiosk.lv5kiosk;

import java.util.Scanner;

public class Kiosk {
    //설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.

    //속성
    private Menu menuItemsList;
    public Scanner scanner;

    //생성자
    Kiosk(Menu menuItemsList) {
        this.menuItemsList = menuItemsList;
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
            menuItemsList.printCategoryList();

            try {
                // 2) 카테고리 입력
                int categoryNumber = filteredInputDevice();

                // 3) 프로그햄 종료
                if (categoryNumber == 0) {
                    System.out.println("🙋🏼🙋🏻‍♀️🙋🏽‍♂️ 이~~ 그려 멀리 안가니께 잘가~.");
                    scanner.close(); //입력 콘솔 제서
                    break;

                    // 4) 올바른 카테고리 입력 (카테고리 메뉴 길이 만큼)
                } else if (1 <= categoryNumber && categoryNumber <= menuItemsList.getMenuItems().size()) {

                    //상세 메뉴 진입 (뒤로가기 0을 누를 때까지 반복)
                    int categoryDetailsNumber = categoryNumber;

                    while (true) {

                        // 1. 카테고리 헤더 출력 및 메뉴 출력
                        switch (categoryDetailsNumber) {
                            case 1 -> System.out.println("\n[ BURGERS MENU ]");
                            case 2 -> System.out.println("\n[ DRINKS MENU ]");
                            case 3 -> System.out.println("\n[ DESSERTS MENU ]");
                        }

                        // 2. 해당 카테고리의 메뉴 아이템 리스트 출력
                        menuItemsList.showItemMenu(categoryNumber);

                        // 3. 아이템 번호 입력
                        int itemNumber = filteredInputDevice();

                        // 4. 뒤로가기 처리 (0 입력)
                        if (itemNumber == 0) {
                            System.out.println("\n카테고리 메뉴로 돌아갈게유~.");
                            break; // 상세 메뉴 루프 종료 -> 메인 루프 재시작
                        }
                        // 5. 아이템 선택 처리 및 출력
                        if (1 <= itemNumber && itemNumber <= menuItemsList.getMenuItems().get(categoryNumber - 1).size()) {
                            menuItemsList.showChoseItem(categoryNumber, itemNumber);
                        } else {
                            System.out.println("\n‼️아니 키보드가 고장난거 아녀유?? 다시 입력 해봐유 ㅠ.ㅠ");
                        }
                    }
                }

                // 5) 메뉴 입력 오류 안내 문구 (메뉴번호 외의 숫자 입력의 경우)
                else {
                    System.out.println("️\n‼️이이~~??\n‼️가만있어봐~ 그게 손님 눈에는 그게 있는거여~? 자~~알 봐~유~\n");
                }

                // 그 외 오류 처리
            } catch (IndexOutOfBoundsException e) {
                // ⭐️ [Lv. 5] IndexOutOfBounds는 메뉴 번호를 벗어난 경우 발생 (예: 99 입력)
                System.out.println("\n‼️이이~~??\n‼️키보드가 성난겨???\n메뉴 번호를 다시 확인해봐유~");
            } catch (Exception e) {
                System.out.println("\n‼️예상치 못한 오류가 발생했슈. 다시 시도해봐유.");
            }
        }
    }
}
