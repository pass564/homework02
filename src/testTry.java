import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testTry extends Thread{
    private FileInputStream fis;

    private FileOutputStream fos;

    public testTry(String name,FileInputStream fis, FileOutputStream fos) {
        super(name);
        this.fis = fis;
        this.fos = fos;
    }

    @Override
    public void run() {
        StringBuilder str = new StringBuilder();
        try {
            int read = fis.read();
            str.append(Thread.currentThread().getName()+":"+(char)read);
            fos.write(str.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}