package Ch16.sec04;

import static java.lang.Double.sum;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

//        리턴문이 하나만 있을 경우(연산식)
//        person.action((x, y) -> {
//        return (x + y);
//        });
        person.action((x, y) -> (x + y));

//        리턴문이 하나만 있을 경우(메소드 호출)
//        person.action((x, y) -> {
//        return sum(x, y);
//        });
        person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
