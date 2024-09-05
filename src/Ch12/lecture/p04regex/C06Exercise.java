package Ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C06Exercise {
    //    사용자 입력을 받아서
//    전화번호 패턴과 같은지 확인
//    010-9999-1111
//    02-2345-6789
//    031-789-7890
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "\\d{3}-\\d{4}-\\d{4}";
        while (true) {
            System.out.print("전호번호>");
            String input = scanner.nextLine();

            if (java.util.regex.Pattern.matches(pattern, input)) {
                System.out.println("유효한 전화번호");
            } else {
                System.out.println("유효하지 않습니다.");
            }
        }
    }
}
