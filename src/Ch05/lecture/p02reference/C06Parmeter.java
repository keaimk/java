package Ch05.lecture.p02reference;

public class C06Parmeter {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5};

        method1(arr);

        System.out.println(arr[0]);
    }

    public static void method1(int[] a) {
        System.out.println(a[0]); // 4
        a[0] = 44;
        System.out.println(a[0]); // 44
    }
}
