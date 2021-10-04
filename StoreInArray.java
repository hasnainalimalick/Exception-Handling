import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class StoreInArray {
    public static void main(String[] args) throws IOException {
        ArrayList al = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt"));
        String s = "";
        while (s != null){
            s = br.readLine();
            al.add(s);
        }
        br.close();

        System.out.println(Arrays.toString(al.toArray()));
    }
}
