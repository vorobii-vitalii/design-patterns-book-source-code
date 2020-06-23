package book.decorator_pattern.decorator_input_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputDriver {

    public static void main(String[] args) throws IOException {
        InputStream stream = null;
        try {
            int c;
            stream = new LowercaseInputStream(new BufferedInputStream(new FileInputStream("testfile.txt")));
            while ( (c = stream.read()) >= 0  ) {
                System.out.print((char) c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            assert stream != null;
            stream.close();
        }
    }

}
