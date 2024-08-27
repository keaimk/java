package Ch06.sec08.exam02;

public class Computer {
    int sum(int... valuse) {
        int sum = 0;

        for (int i = 0; i < valuse.length; i++) {
            sum += valuse[i];
        }

        return sum;
    }
}
