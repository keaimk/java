package Ch02.lecture.p03string;

public class C04TypeConversion {
    public static void main(String[] args) {
//        정수(byte, short, int, long) <-> 실수(float, double)
//        정수(int, long) <-> 실수(double)
//        정수에서 실수는 자동형 변환
//        실수에서 정수는 강제형 변환
        long a = 500000;
        double b = a; // 자동형 변환 ok

        double c = 50000;
        long d = (long) c; // 자동형 변환 x, 강제형 변환 ok

//        소수점 이하의 값을 버릴 때 주로 사용
        double e = 3.14;
        int f = (int) e; // 3
    }
}
