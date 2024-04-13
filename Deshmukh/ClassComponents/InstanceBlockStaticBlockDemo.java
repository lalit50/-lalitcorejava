package ClassComponents;

public class InstanceBlockStaticBlockDemo {
    //instance block :block of code outside all methods, all constructors,
    {
        System.out.println("instance block");
    }

    //Satic block :block of code outside all methods, all constructors with static keyword
    static{
        System.out.println("static block");
    }

    public static void main(String[] args) {
        InstanceBlockStaticBlockDemo demo1 =new InstanceBlockStaticBlockDemo();
        InstanceBlockStaticBlockDemo demo2 =new InstanceBlockStaticBlockDemo();

    }
}
