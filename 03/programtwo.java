import java.io.*;

public class programtwo {
    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = in.readLine();
            StringBuilder str = new StringBuilder(input);
            str.reverse();
            System.out.println(str.toString());
        }catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }

    }
}
