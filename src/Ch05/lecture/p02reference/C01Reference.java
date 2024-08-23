package Ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a;
        int[] arr; // arr는 참조변수

        a = 3;
        arr = new int[]{5, 6}; // new int[]{5, 6}는 객체
        System.out.println(a); // 3
        System.out.println(arr); //
        System.out.println(System.identityHashCode(arr)); // 참조값 확인

        int b;
        b = a;

        a = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] brr;
        brr = arr;

        arr[0] = 50;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("brr[0] = " + brr[0]); // 5
    }
}
