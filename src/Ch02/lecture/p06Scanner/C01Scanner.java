package Ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {
        //        scanner : 소스를 훑으며 입력을 받음
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력>");
        String str = scanner.nextLine(); // 한 줄 입력 받음

        System.out.println("str = " + str);
    }
}
