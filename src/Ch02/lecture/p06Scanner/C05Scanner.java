package Ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력>");
//        nextLine : 엔터를 만날 때 까지 스캔

        String line1 = scanner.nextLine();

        System.out.println("line1 = " + line1);

//        next : 빈 칸을 만날 때 까지 스캔
        scanner.next();
    }
}
