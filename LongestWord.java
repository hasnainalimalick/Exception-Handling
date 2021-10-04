import java.io.*;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt");
        Scanner sc = new Scanner(f);
        String longest = "";
        String current;
        while (sc.hasNext()){
            current = sc.next();
            if (current.length() > longest.length())
                longest = current;
        }
        System.out.println(longest);

    }
}
