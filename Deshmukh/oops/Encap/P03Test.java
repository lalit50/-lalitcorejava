package oops.Encap;

public class P03Test {
    public static void main(String[] args) {
        P03Sudent p03SudentRef = new P03Sudent();
        p03SudentRef.setSudId(73);
        p03SudentRef.setSudName("vaibhav ");
        p03SudentRef.setSudAge(-5);

        System.out.println(p03SudentRef.getSudId());
        System.out.println(p03SudentRef.getSudName());
        System.out.println(p03SudentRef.getSudAge());



        System.out.println("Next sudent-------------");
        P03Sudent p03Sudent2 = new P03Sudent();
        p03Sudent2.setSudId(63);
        p03Sudent2.setSudName("navina");
        p03Sudent2.setSudAge(34);
        System.out.println(p03Sudent2.getSudId());
        System.out.println(p03Sudent2.getSudName());
        System.out.println(p03Sudent2.getSudAge());


        System.out.println("next sudent----------------------");
        P03Sudent p03Sudent3 = new P03Sudent();
        p03Sudent3.setSudId(37);
        p03Sudent3.setSudName("nalayak");
        p03Sudent3.setSudAge(63);
        System.out.println(p03Sudent3.getSudId());
        System.out.println(p03Sudent3.getSudName());
        System.out.println(p03Sudent3.getSudAge());
    }
}
