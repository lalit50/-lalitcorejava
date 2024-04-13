package Loop;

public class Demo13Break {
    public static void main(String[] args) {
        //break :Keyaord -> Can be used within toops[for, while, do-while, foreach] and switch
        System.out.println("");
        //break;

        while (true){
            System.out.println("while loop body");
            break;
        }
        System.out.println("rest of the main methed");
    }
}
