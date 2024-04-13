package FileHendlingDay1;

import java.io.File;
import java.io.IOException;

public class Demo14FileObjectListingFilter {
    public static void main(String[] args) throws IOException {
        String Filepath ="C:\\Users\\Lalit\\IdeaProjects Deshmukh\\Deshmukh\\FileHendlingDay1\\Test\\";
        File fileRef = new File(Filepath+"moblie");
        boolean isFileCreated = fileRef.createNewFile();
        System.out.println("Created new File \t\t" +isFileCreated);

    }
}
