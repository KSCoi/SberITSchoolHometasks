package HomeTasks.Lection13.Zadanie1;

import java.io.*;

public class WorkWithFile {

    public static void main(String[] args) {

        try {
            InputStream is = new BufferedInputStream(new FileInputStream("src/HomeTasks/Lection13/HandFile.txt"));
            OutputStream os = new BufferedOutputStream( new FileOutputStream("src/HomeTasks/Lection13/newFile.txt"));
            is.skip(2);
            for (int i = 0; i < 4; i++) {
                System.out.println((char) is.read());
            }

            byte[] buffer  = new byte[is.available()];
            is.read(buffer,0,buffer.length);
            os.write(buffer);
            os.close();

        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
