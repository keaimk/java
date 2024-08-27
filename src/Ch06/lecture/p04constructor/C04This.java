package Ch06.lecture.p04constructor;

public class C04This {
    public static void main(String[] args) {
        MyClass04 o = new MyClass04(33, "lee");
        System.out.println(o.age); // 0
        System.out.println(o.name); // null

        MyClass04 p = new MyClass04(55, "kim");
        System.out.println(p.age);
        System.out.println(p.name);
    }
}

class MyClass04 {
    int age;
    String name;

    MyClass04(int age, String name) {
        this.age = age;
        this.name = name;
    }
}