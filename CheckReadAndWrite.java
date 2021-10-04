import java.io.File;

public class CheckReadAndWrite {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Malik\\IdeaProjects");
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
    }
}
