package scanner;

import java.util.Scanner;

public class ScannerWhile4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;
        while (true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            if (option==1){
                input.nextLine(); // 이전에 입력된 개행문자 제거
                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();
                totalCost += price * quantity;
                System.out.println("상품명:" + product + " 가격:" + price + " 수량:"
                        + quantity + " 합계:" + price * quantity);
            }
            if( option==2){
                input.nextLine(); // 이전에 입력된 개행문자 제거
                System.out.println("총 비용: "+totalCost);

            }
            if(option==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
