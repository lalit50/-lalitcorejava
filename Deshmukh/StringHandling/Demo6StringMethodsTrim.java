package StringHandling;

public class Demo6StringMethodsTrim {
    public static void main(String[] args) {
        String str = "     welcome to string handling   ";
        System.out.println(str.length());
        str = str.trim();
        System.out.println("After trim   "+str.length());
        System.out.println(str);


    }
}