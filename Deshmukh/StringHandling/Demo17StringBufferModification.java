package StringHandling;

public class Demo17StringBufferModification {
    public static void main(String[] args) {
        String greetings = "welcome to IT Shaala";
        System.out.println(greetings);
        StringBuffer stringBufferRef = new StringBuffer(greetings);
        stringBufferRef.append(" Pune");
        System.out.println(stringBufferRef);
        System.out.println(greetings);
    }
}