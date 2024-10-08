package Ch06.lecture.p10singleton;

import javax.management.monitor.CounterMonitor;

public class C01Singleton {
    public static void main(String[] args) {
//        Country c = new Country();
//        Country d = new Country();

        Country c = Country.getInstance();
        Country d = Country.getInstance();
    }
}

class Country {
    private static Country s;

    private Country() {

    }

    public static Country getInstance() {
        if (s == null) {
            s = new Country();
        }
        return s;
    }
}
