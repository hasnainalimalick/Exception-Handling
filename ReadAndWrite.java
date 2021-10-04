import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(f));
        BufferedReader br = new BufferedReader( new FileReader(f));
        String s = "ji bhai";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            bf.write(c[i]);
        }
        bf.close();
        int i = 0;
        while (i != -1){
            i = br.read();
            System.out.print((char) i);
        }
        br.close();
    }
}
