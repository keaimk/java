package Ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) { // 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
                continue; // 만약 i가 홀수라면 continue 문이 실행되지만 현재는 반복을 건너뛰고
            }
            System.out.print(i + " "); // i가 짝수일 때만 실행된다. 짝수인 i 값을 출력하고 공백을 추가로 출력한다.
        }
    }
}
