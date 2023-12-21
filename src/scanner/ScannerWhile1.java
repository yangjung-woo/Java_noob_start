package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // exit를 입력할 때 까지 문자열을 그대로 출력

        while (true){
            System.out.println("문자열을 입력 하세요 (exit 종료)");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            System.out.println(input);
        }

    }
}
