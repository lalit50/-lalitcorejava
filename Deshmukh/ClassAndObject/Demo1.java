package ClassAndObject;

public class Demo1 {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 1;
        for (System.out.println("initialization"); flag && i < 4; i++, System.out.println("increment/decrement i " + i)) {
            System.out.println("for loop body i " + i + "  flag " + flag);
//            flag =false;
        }
        System.out.println("rest of main");
    }
}
