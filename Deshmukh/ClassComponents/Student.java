package ClassComponents;

public class Student {
    int rollNumber;
    String name;
    int phaddNumber;
    String addres;

    public static void main(String[] args) {
        Student john =new Student();
        john.rollNumber =100;
        john.name ="john";
        john.addres = "chalisgoan";

        Student sam =new Student();
        sam.rollNumber =102;
        sam.name= "sam";
        sam.addres ="pune";

        System.out.println("john"+john.rollNumber+"\t"+john.name+"\t"+john.addres);

    }
}
