package scanner;

import java.util.Scanner;

public class ScannerProblem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("상품의 가격을 입력하세요 (-1 이면 종료): ");
            int price = input.nextInt();
            //input.nextInt();// input.nextLine 이 없으므로 상관 없음
            if (price == -1){
                System.out.println("프로그램을 종료합니다 ");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = input.nextInt();
            //input.nextInt();// 줄바꿈을 먹을 함수

            System.out.println("총 비용: "+(price*quantity));
        }
    }
}
