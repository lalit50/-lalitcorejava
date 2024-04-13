package FileHendlingDay1;

import java.io.File;
import java.io.IOException;

public class Demo2CreateNewFileInFolder {
    public static void main(String[] args) throws IOException {
        //Caeate a new folder
        String Fodelerpath = "C:\\Users\\Lalit\\IdeaProjects Deshmukh\\Deshmukh\\FileHendlingDay1\\Test\\";

        File folderRef = new File(Fodelerpath + "notso");
        boolean isFolderCreated = folderRef.mkdir();
        System.out.println("Folder is Created " + isFolderCreated);
    }
}
