package Ch02.lecture.p04conversion;

public class C07TypeConversion {
    public static void main(String[] args) {
//        강제형 변환(casting)은 기본 타입간, 또는 참조 타입 간에만 가능
        long a = 3;
        int b = (int) a; // 기본 타입끼리의 캐스팅 가능

        //
//        String c = (String) a; // 기본 타입과 참조 타입간의 형 변환 x
        String d = "3";
//        int e = (int) d; // 기본 타입과 참조 타입간의 형 변환 x
    }
}
