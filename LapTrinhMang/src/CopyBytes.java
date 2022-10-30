import java.io.*;
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("abc.txt");
        File outFile = new File("xyz.txt");
        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream  out = new FileOutputStream(outFile);
        int c;
        while ((c= in.read()) !=1)
                out.write(c);
        in.close();
        out.close();
    }
}