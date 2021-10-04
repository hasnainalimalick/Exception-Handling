import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RaedLineByLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt"));
        String read ="";
        while (read != null){
            read = br.readLine();
            System.out.println(read);
        }
        br.close();
    }
}
