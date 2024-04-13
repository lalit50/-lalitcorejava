package FileHendlingDay1;

import java.io.File;
import java.io.IOException;

public class Demo8FilePermission {
    public static void main(String[] args)throws IOException {
        String Fodelerpath = "C:\\Users\\Lalit\\IdeaProjects Deshmukh\\Deshmukh\\FileHendlingDay1\\Test\\";
        File fileRef =new File(Fodelerpath+"newfila1");
//        fileRef.setReadable(false);
        fileRef.setWritable(true);
        System.out.println("permissions set to read only ");
    }
}
