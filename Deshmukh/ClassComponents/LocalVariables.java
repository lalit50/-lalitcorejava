package ClassComponents;

public class LocalVariables {
    public static void main(String[] args) {
        //Local Variables
        int a = 200;  //Local primitiva veriable
        String name = "abc"; //Local Reference variable
        display();
        System.out.println(a);
        System.out.println(name);


    }
    public static void display(){
        System.out.println("display method");
        int a =1000 ;
        String name ="xyz";
        System.out.println (a);
        System.out.println(name);
    }
}
