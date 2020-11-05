import java.io.*;

public class Io {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lib\\test.txt");
        FileOutputStream fos = new FileOutputStream("lib\\aim.txt");
        testTry A = new testTry("A", fis, fos);
        testTry B = new testTry("B", fis, fos);
        A.start();
        B.start();

    }
}
