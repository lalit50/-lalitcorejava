package Loop;

public class Demo3 {
    public static void main(String[] args) {
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789


        for (int r=1;r <=9;r++){

            for(int j =1;j<=r;j++){

        System.out.print(+j);
    }
            System.out.println("");
        }

    }

    public static class Demo6 {
        public static void main(String[] args) {

    //        1
    //        12
    //        123
    //        1234
    //        12345
    //        123456
    //        1234567
    //
    //        7654321
    //        765432
    //        76543
    //        7654
    //        765
    //        76
    //        7



            for (int r = 1; r <= 7; r++) {
                for (int j = 1; j <= r; j++) {
                    System.out.print(+j);
                }
                System.out.println();
            }
            System.out.println();
            for(int r=1; r <=7;r++){
                for (int j=7; j >=r;j--){
                    System.out.print(+j);
                }
                System.out.println();
            }
        }
    }
}
