import java.util.*;
import java.io.*;

public class Caesar {

    public static void main(String args[]){
        InputStream in = System.in;
        OutputStream out = System.out;
        int cipher=0;
        int count;

        if (args.length > 0) {
            try {
                cipher = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[1] + "must be an intefer.");
                System.exit(1);
            }
        }

        try {
            while ((count = in.read()) != -1) {
                count += cipher;
                count %= 256;
                out.write(count);
            }
            out.close();
        } catch ( IOException e){
            System.out.println("IOExecotion");
        }
    }
  
}
