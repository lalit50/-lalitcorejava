package ClassComponents;

public class Triangle {

    int side1;
    int side2;
    int side3;
    int getperimiter(){
        return side1+ side2+side3;
    }
    double getArea(){
        return 0.5* (side1+side2+side3);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = 4;
        triangle.side2 = 3;
        triangle.side3 = 5;

        System.out.println("perimiter of Tringle"+triangle.getperimiter());
        System.out.println("Area of the Triangl"+triangle.getArea());


    }
}
