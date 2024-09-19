package Ch18.lecture.p1io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C05OutputStream {
    public static void main(String[] args) {

        String name = "C:/Windows/Temp/output5.txt";

        try (OutputStream os = new FileOutputStream(name);) {
            os.write(55); // 1 byte 쓰기
            os.write(new byte[]{5, 6, 7}); // 3 bytes 쓰기
            os.write(new byte[]{11, 22, 33, 44, 55}); // 5bytes
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}