package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        int sum =0;
        int cnt =0;
        int a =0;
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while( (a =input.nextInt()) != -1){
            sum += a;
            cnt +=1;
        }
        double average = (double) sum / cnt;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

    }
}
