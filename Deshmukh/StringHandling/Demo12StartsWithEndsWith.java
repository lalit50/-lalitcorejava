package StringHandling;

public class Demo12StartsWithEndsWith {
    public static void main(String[] args) {
        String str = "website development using HTML";
        System.out.println(str);
        System.out.println("String endswith HTML "+ str.endsWith("HTML"));
        System.out.println("String starts with website "+ str.startsWith(" using"));
        System.out.println("String starts with WEBSITE "+ str.startsWith("WEBSITE"));
    }
}