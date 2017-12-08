import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewFile implements Runnable {

    private String inp;

    public NewFile(String inp) {
        this.inp = inp;
        new Thread(this).start();
    }

    @Override
    public void run() {
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(InOut.fileName + "_" + InOut.version.addAndGet(1));
        } catch (FileNotFoundException e) {}
        try {
            f.write(inp.getBytes());
        } catch (IOException e) {}
        try {
            f.write('\n');
        } catch (IOException e) {}
        try {
            f.close();
        } catch (IOException e) {}
    }
}
