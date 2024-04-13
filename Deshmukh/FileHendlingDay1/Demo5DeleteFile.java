package FileHendlingDay1;

import java.io.File;
import java.io.IOException;

public class Demo5DeleteFile {
    public static void main(String[] args) throws IOException {
        //Delete a new file
        String Fodelerpath = "C:\\Users\\Lalit\\IdeaProjects Deshmukh\\Deshmukh\\FileHendlingDay1\\Test\\";
        File fileRef = new File(Fodelerpath + " shivajinager");
        System.out.println("File Deleted " + fileRef.delete());
    }
}