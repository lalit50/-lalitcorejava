package FileHendlingDay1;

import java.io.File;
import java.io.IOException;

public class Demo9ListFiles {
    public static void main(String[] args) throws IOException {
        String Fodelerpath = "C:\\Users\\Lalit\\IdeaProjects Deshmukh\\Deshmukh\\FileHendlingDay1\\Test\\";

        File fileRef = new File(Fodelerpath);
        String[]fileNameList = fileRef.list();
        for (String FileName: fileNameList){
            System.out.println(FileName);
        }
    }
}
