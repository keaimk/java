package Ch11.lecture.p05throw;

import java.io.IOException;

public class C04Throw {
    public static void action1() throws IOException {
        throw new IOException();
    }

    public static void action2() throws IOException {
        action1();
    }

    public static void action3() throws IOException {
        action2();
    }

    public static void action4() throws IOException {
        action3();
    }
}
