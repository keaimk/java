package Ch09.lecture.p02nested;

public class C07Interface {
}

class MyClass7 {
//    nested interface (중첩된 interface)
//    static 생략 가능

    static interface Nested7 {
    }

    void someMethod() {
        Nested7 o = new Nested7() {

        };
    }
}

interface MyInterface7 {
}
