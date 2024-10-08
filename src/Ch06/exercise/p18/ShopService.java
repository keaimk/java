package Ch06.exercise.p18;

import Ch06.sec15.Singleton;

public class ShopService {
    private static ShopService singleton = new ShopService();

    private ShopService() {
    }

    static ShopService getInstance() {
        return singleton;
    }
}
