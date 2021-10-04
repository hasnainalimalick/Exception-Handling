import java.io.File;

public class CompareTwoFiles {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt");
        File file2 = new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\example.txt");
        int result = file1.compareTo(file2);
        if (result == 0)
            System.out.println("Yes Equal");
        else System.out.println("Not Equal");
    }
}
