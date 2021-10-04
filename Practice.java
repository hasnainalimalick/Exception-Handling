import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt");
        System.out.println("Files exists " + f.exists());
        f.createNewFile();
        System.out.println(f.canWrite());
        System.out.println(f.length());
        System.out.println(f.getName());
        FileOutputStream fout = new FileOutputStream("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt", true);
        String s = "hasnain";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            fout.write(c[i]);
        }
        fout.close();
        int i = 0;
        FileInputStream fin = new FileInputStream(f);
        while (i != -1){
            i = fin.read();
            System.out.print((char) i);
        }
        fin.close();


    }
}
