package ObjectClassMethods;

public class Demo2EqualsMethod {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(a==b);//true
        Student student1  = new Student(1,"Lalit");
        Student student2  = new Student(1,"Lalit");
        System.out.println(student1== student2);// false refernce check
        System.out.println(student1.equals(student2));
    }
}
