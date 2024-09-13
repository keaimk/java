package Ch11.lecture.p02try;

public class C04Finally {
    public static void main(String[] args) {
        try {
            int[] a = {3, 4};
            int b = a[3]; // 예외 발생 가능

//            try 블럭내의 다음 코드
            System.out.println("b = " + b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            finally 블럭내의 코드
//            : 예외 발생 상관없이 실행
            System.out.println("꼭 실행되어야 하는 코드들");
        }

//        try 블럭 밖의 코드
        System.out.println("다음 실행 흐름 ..");
    }

    public static class C05Finally {
        public static void main(String[] args) {
            try {
                int[] arr = {3, 4};
                int a = arr[3]; // 예외 발생 가능

                System.out.println("a = " + a);
                return;
                //            System.out.println("실행안됨");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 심지어 return 되어도 실행
                System.out.println("꼭 실행되어야 하는 코드");
            }

            System.out.println("다음 실행 흐름...");
        }
    }
}
