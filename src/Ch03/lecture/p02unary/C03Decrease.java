package Ch03.lecture.p02unary;

public class C03Decrease {
    public static void main(String[] args) {
//        감소 연산자
//        --
//        피연산자의 값에 1을 뺀 후 다시 피연산에 대입
        int a = 10;
        --a;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);
    }
}
