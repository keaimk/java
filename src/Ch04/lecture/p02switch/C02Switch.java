package Ch04.lecture.p02switch;

public class C02Switch {
    public static void main(String[] args) {
//        1, 2, 3
        int n = (int) (Math.random() * 3) + 1;

        switch (n) {
            case 1:
                System.out.println("첫 번째");
                break;
            case 2:
                System.out.println("두 번째");
                break;
            case 3:
                System.out.println("세 번째");
                break;
        }
    }
}
