package scanner;

import java.util.Scanner;

public class ScannerProblem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int N =scanner.nextInt();
        System.out.println(N+"단의 구구단:");
        for (int i=1; i <10 ;i++ ){
            int stepN = i * N;
            System.out.println(N+" x " + i + " = "+ stepN);
        }
    }
}
