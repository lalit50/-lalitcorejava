package ClassComponents;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    void setDimension(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
        int getArea () {
            return length * breadth;
        }
        public static void main (String[]args){

            //accept Length and breadth
            System.out.println("Enter the lenth and breadth");
            Scanner scanner = new Scanner(System.in);
            int lendth = scanner.nextInt();
           int breadth = scanner.nextInt();
           Rectangle rectangle =new Rectangle( lendth,breadth);

//            Rectangle.setDimension(length, breadth);
            System.out.println("Area of rectangle" + rectangle.getArea());

        }

    }
