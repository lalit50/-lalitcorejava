package ObjectClassMethods;

public class Demo4HeshCodeMethod {
    public static void main(String[] args) {
        Student studentRef1 =new Student(1  ,"pooja");
        Student studentRef2 =new Student(1  ,"pooja");
        System.out.println(studentRef1 == studentRef2); //refernce check : false
        System.out.println(studentRef1.equals(studentRef2));//co
    }

}
