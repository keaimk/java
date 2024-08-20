package Ch03.lecture.p03compare;

import java.sql.SQLOutput;

public class C02Compare {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.1;
        double c = 0.1;
        double d = a + b;

        System.out.println(c == d); // true(?)

        long e = (long) (c * 100000);
        long f = (long) (d * 100000);
        System.out.println("f = " + f);
    }
}
