package scanner;

import java.util.Scanner;

public class ScannerProblem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요:");
        int a = scanner.nextInt();

        if (a %2 ==0){
            System.out.println("입력하신 숫자 "+ a +"는 짝수입니다.");

        }
        else{
            System.out.println("입력하신 숫자 "+ a +"는 홀수입니다.");
        }

    }
}
