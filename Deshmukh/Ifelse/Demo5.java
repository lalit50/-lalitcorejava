package Ifelse;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("which file open the =");
        String filename = Scanner.next();
        if (filename.equals("txt")) {
            System.out.println("code to read txt files");
        }
        if (filename.equals("doc")) {
            System.out.println("code to read doc files");
        }

        if (filename.equals("excal")) {
            System.out.println("code to read excal files");
        }

        if (filename.equals("json")) {
            System.out.println("code to read json files");
        }
        if (filename.equals("pdf")) {
            System.out.println("code to read  pdf files");
        } else {
            System.out.println(" invalid file type");
        }


    }
}
