package Ch06.lecture.p07package;

import Ch06.lecture.p07package.package1.MyClass01;

public class C03Package {
    public static void main(String[] args) {
//        다른 패키지에 있는 클래스 사용 시 import헤서 사용
        MyClass01 o1 = new MyClass01();

        System.out.println(o1);
    }
}
