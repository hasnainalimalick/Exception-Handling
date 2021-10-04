import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadContent {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt");
        FileInputStream fin = new FileInputStream(f);
        byte[] read = new byte[234567];
        int i = 0;
        while (i != -1){
            i = fin.read();
            System.out.println((char) i);
        }


    }
}
