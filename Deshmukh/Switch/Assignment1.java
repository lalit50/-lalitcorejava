package Switch;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Enther the month number");
        Scanner Scanner = new Scanner(System.in);
        int month = Scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("Aper");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("Aogust");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("Dem");
                break;
            default:
                System.out.println("Invalid month");
                break;

        }
    }
}

