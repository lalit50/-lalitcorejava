package StringHandling;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = new String("greetings of the day");
        String str2 = "greetings of the day";
        String str3 = new String("greetings of the day");
        String str4 = "greetings of the day";

        System.out.println(str1+" ~~~~ "+str1.intern().hashCode());
        System.out.println(str2+" ~~~~ "+str2.intern().hashCode());
        System.out.println(str3+" ~~~~ "+str3.intern().hashCode());
        System.out.println(str4+" ~~~~ "+str4.intern().hashCode());


        //str1 and str2 both are reference variables

    }
}