package Loop;

public class Demo12Break {
    public static void main(String[] args) {
        //break :Keyaord -> Can be used within toops[for, while, do-while, foreach] and switch
        System.out.println("");
        //break;

        for(;;){
            System.out.println("for loop body");
            break;
        }
        System.out.println("rest of the main methed");
    }
}
