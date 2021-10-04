import java.io.File;

public class IfDirectoryOrFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Malik\\IdeaProjects");
        System.out.println(f.isDirectory()+f.getAbsolutePath());
        System.out.println(f.isFile()+f.getAbsolutePath());
    }
}
