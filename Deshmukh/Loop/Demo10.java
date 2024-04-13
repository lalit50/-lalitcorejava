package Loop;

public class Demo10 {
    public static void main(String[] args) {


//        4321
//        432
//        43
//        4

        for (int r = 1; r <= 4; r++) {
            for (int j = 1; j <= r; j++) {
                System.out.print(" ");
            }
            for (int k=4;k>=r;k--){

                System.out.print(""+k);
            }
            System.out.println();

        }
    }
}
