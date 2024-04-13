package FileHendlingDay1.FileHendlingDay3.fileCopy;

import java.io.File;
import java.io.IOException;

public class Demo1CreateNewFile {
    public static void main(String[] args) throws IOException {
        //create a new file
        File file = new File(" JanretaFile");
        boolean isFileCreated = file.createNewFile();
        System.out.println("File created " + isFileCreated);
    }
}