package Ch06.lecture.p03method;

import java.util.Arrays;

public class C08Varargs {
    public static void main(String[] args) {
//        varargs(variable arguments, 가변길이 매개변수):

        Myclass08 o = new Myclass08();
        o.method2();
        o.method2(1);
        o.method2(10, 20);
        o.method2(5, 6, 7, 7, 1, 1, 1, 1, 1);

        System.out.println();
        o.method3();
        o.method3(10, 20);
        o.method3();
    }
}

class Myclass08 {
    public void method1() {
        System.out.println("같은 일");
    }

    public void method1(int a) {
        System.out.println("같은 일");
    }

    public void method1(int a, int b) {
        System.out.println("같은 일");
    }

    public void method2(int... a) {
        System.out.println("메소드 2 할 일 ...");
    }

    public void method3(int... a) {
//        a를 배열로 사용 가능
        System.out.println("a.length = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
