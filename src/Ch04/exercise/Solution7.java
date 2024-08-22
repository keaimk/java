/*package Ch04.exercise;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;

        while (run) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                money++;
                System.out.println("예금액 = " + 10000);
            } else if (strNum.equals("2")) {
                money--;
                System.out.println("출금액 = " + 2000);
            } else if (strNum.equals("3")) {
                money++;
                System.out.println("잔고 = " + 8000);
            } else if (strNum.equals("4")) {
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
} */

package Ch04.exercise;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        int balance = 0; // 잔고
        while (run) {
            System.out.print("""
                    --------------------------
                    1.예금|2.출금|3.잔고|4.종료
                    --------------------------
                    """);
            System.out.print("선택>");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("예금액>");
                    int money = scanner.nextInt();
                    balance += money;
                }
                case 2 -> {
                    System.out.print("출금액>");
                    int money = scanner.nextInt();
                    balance -= money;
                }
                case 3 -> {
                    System.out.println("잔고>" + balance);
                }
                case 4 -> {
                    // 종료
                    run = false;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}