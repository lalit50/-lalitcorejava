package FileHendlingDay1;

import java.io.File;
import java.io.IOException;

public class Demo7FileSize {
    public static void main(String[] args) throws IOException {
        String Fodelerpath = "C:\\Users\\Lalit\\IdeaProjects Deshmukh\\Deshmukh\\FileHendlingDay1\\Test\\";
        File fileRef = new File(Fodelerpath+"newfila1 ");
        System.out.println(" File Size"+ fileRef.length());

    }
}
