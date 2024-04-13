package While;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        int number = Scanner.nextInt();
        while (number!=0){
            System.out.println("you have enred"+number);
            System.out.println("Do you want to cantinue");
          number = Scanner.nextInt();

        }

    }
}
