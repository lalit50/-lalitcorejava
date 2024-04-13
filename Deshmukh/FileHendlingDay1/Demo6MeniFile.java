package FileHendlingDay1;

import java.io.File;
import java.io.IOException;

public class Demo6MeniFile {
    public static void main(String[] args)throws IOException {
        String Fodelerpath = "C:\\Users\\Lalit\\IdeaProjects Deshmukh\\Deshmukh\\FileHendlingDay1\\Test\\";
        for (int i = 1; i <9 ; i++) {


        File fileRef =new File( Fodelerpath+"newfila"+i);
        boolean isFileCreated = fileRef.createNewFile();

            System.out.println("File Created"+ isFileCreated);

    }
    }
}
