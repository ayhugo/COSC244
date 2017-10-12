import java.util.*;
import java.io.*;
public class BitLevel {
    public static void main(String []args){
        InputStream in = null;
        OutputStream out = null;
        int count;
        String key = "";

        try {
            in = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);
        }catch (IOException ex) {
        }
        
        try {
            System.out.println("Enter Key: ");
            Scanner scan = new Scanner(System.in);
            key = scan.next();
            System.out.println(key);

            int index = 0;
            while ((count = in.read()) != -1) {
                if (index == key.length()) {
                    index = 0;
                }
                
                out.write(count ^ key.charAt(index));
                index++;
            }
            out.close();
        }catch (Exception e) {
        }

       


    }
}
