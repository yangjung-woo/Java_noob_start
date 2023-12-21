package scanner;

import java.util.Scanner;

public class ScannerProblem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요: ");
        String foodName =scanner.nextLine();
        System.out.print("음식 가격을 입력해주세요: ");
        int foodPrice =scanner.nextInt();
        System.out.print("음식 수량을 입력해주세요: ");
        int foodNum =scanner.nextInt();

        int sum = foodPrice * foodNum;
        System.out.println(foodName+" "+foodNum+"개를 주문하셨습니다. 총 가격은 "+sum+"원입니다.");
    }
}
