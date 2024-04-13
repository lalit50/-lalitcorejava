package Loop;

public class Demo11 {
    public static void main(String[] args) {

//        1
//        12
//        123
//        1234
//        12345
//        123456
//        54321
//        5432
//        543
//        54
//        5



        for(int r=1; r<=6;r++){
            for(int j=5;j>=r;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=r;k++){
                System.out.print(+k);
            }
            System.out.println();

        }
        for(int r=1;r<=6;r++){
            for(int j=1;j<=r;j++){
                System.out.print(" ");
            }
            for(int k=5;k>=r;k--){

                System.out.print(+k);
            }
            System.out.println();
        }
    }
}
