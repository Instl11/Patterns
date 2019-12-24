package patterns.streamHomework;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestRegExp {
    public static void main(String[] args) {

        try(InputStream in = new URL("http://tululu.org/txt.php?id=18919").openStream();
            FileOutputStream out = new FileOutputStream("999.txt");) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            BufferedOutputStream outputStream = new BufferedOutputStream(out);
            BufferedWriter writer = new BufferedWriter(new FileWriter("999.txt"));


            byte[] buffer = new byte[1024*8];
            int i;
            while ((i = in.read(buffer, 0, 8*1024)) >= 0) {
                out.write(buffer, 0, i);
            }


            in.transferTo(out);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error during transfer the file");
        }

    }
}
