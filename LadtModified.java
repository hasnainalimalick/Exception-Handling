import java.io.File;
import java.util.Date;

public class LadtModified {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Malik\\IdeaProjects\\Java Input Ouput\\Files\\exampe.txt");
        Date date = new Date(f.lastModified());
        System.out.println(date);
    }
}
