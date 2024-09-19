package Ch14.lecture.p2status;

public class C01Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드1@@@@@@@@@@");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드###########");
                try {
                    Thread.sleep(500); // 실행 멈춤
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
