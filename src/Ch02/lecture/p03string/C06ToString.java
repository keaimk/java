package Ch02.lecture.p03string;

public class C06ToString {
    public static void main(String[] args) {

//        기본 타입을 String으로 변환하기
//        String.valueOf
//        ""(빈 문자열)과 +(연결 연산)
        int a = 33;
        String b = String.valueOf(a); // "33"
        String c = "" + a; // "33"
        String d = a + "";
    }
}
