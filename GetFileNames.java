import java.io.File;

public class GetFileNames {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Malik\\IdeaProjects");
        String[] arrList = f.list();
        for(String name: arrList)
            System.out.println(name);
    }
}
