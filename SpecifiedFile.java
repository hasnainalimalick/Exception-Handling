import java.io.File;
import java.io.FilenameFilter;
    public class SpecifiedFile {
        public static void main(String[] args) {


            File file = new File("C:\\Users\\Malik\\IdeaProjects\\Method\\src");
            String[] list = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if(name.toLowerCase().endsWith(".java")){
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            for(String f:list){
                System.out.println(f);
            }
        }
    }

