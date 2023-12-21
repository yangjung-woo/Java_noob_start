package scanner;

import java.util.Scanner;

public class ScannerProblem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이을 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력 후의 줄바꿈 처리
            System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다");
            /*
               두번째 입력에서 10\n이  10 따로 \n 은 String name에 입력되어 스킵된다
               따라서 intinput에서 줄바꿈을 입력받을 scanner.nextLine(); 을 추가한다
             */
        }
    }

}
