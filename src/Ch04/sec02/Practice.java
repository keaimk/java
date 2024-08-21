package Ch04.sec02;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이>");
        
        int age = scanner.nextInt();

        if (age >= 20) {
            System.out.println("나이가 20세 이상입니다.");
            System.out.println("성인입니다.");
        } else if (age >= 13) {
            System.out.println("나이가 13~19세입니다.");
            System.out.println("청소년입니다.");
        } else if (age >= 6) {
            System.out.println("나이가 6~12세입니다.");
            System.out.println("어린이입니다.");
        } else if (age >= 1) {
            System.out.println("나이가 1~5세입니다.");
            System.out.println("유아입니다.");
        } else {
            System.out.println("나이를 잘못 입력하였습니다.");
        }
    }
}
