import java.io.*;

public class programone {
    public static void main(String[] args){
        OutputStream out = System.out;
        InputStream in = System.in;
        int i = 0;
        try {
        while (i != -1) {
            i = in.read();
            out.write(i);
        }
        
        in.close();
        out.close();

        }catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }

    }
}
