import java.io.*;

public class ReadLineByLine {
    public static void main(String[] args) throws IOException {
        File f= new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String readLine = "";
        while ( (readLine = br.readLine()) != null){
            System.out.println(readLine);
        }
        br.close();
    }
}
