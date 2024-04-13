package Array.ArrayAccessing;

public class Accessing10OddEven {
    public static void main(String[] args) {
//        int[] numberArray = {24, 74, 65, 87, 84, 93, 86, 56, 87, 56};
        int[] numberArray = {2, 3, 5, 6};
        int left = 0;
        int right = numberArray.length - 1;
        System.out.println("\t Even left \t\t\t Odd right ");
        for (int j = 0; j < numberArray.length; j++) {
            System.out.print("     " + numberArray[j]);
        }
        System.out.println();
        while (left < right) {
            int lefEle = numberArray[left];
            int rigEle = numberArray[right];

            boolean flagToMoveOnOddd = false;
            boolean flagToMoveOnEven = false;

//            System.out.println("\t\t " + left + "=" + lefEle + "\t\t " + right + "=" + rigEle);

            if (lefEle % 2 != 0) {
                /* exchange values*/
                flagToMoveOnOddd = true;
            }
            if (rigEle % 2 == 0) {
                /* exchange values*/
                flagToMoveOnEven = true;
            }
            if (flagToMoveOnOddd && flagToMoveOnEven) {
                int Temp = numberArray[right];
                numberArray[right] = numberArray[left];
                numberArray[left] = Temp;
            } else {
                if (flagToMoveOnOddd) {/*move to right*/
                }
                if (flagToMoveOnEven) {/*move to left*/
                }
            }
            left++;
            right--;


        }
        System.out.print("\t\t\t ODD  --- ");
        int i = 0;
        for (; i < numberArray.length / 2; i++) {
            System.out.print("     " + numberArray[i]);
        }
        System.out.println();
        System.out.print("\t\t\t Even --- ");
        for (; i < numberArray.length; i++) {
            System.out.print("     " + numberArray[i]);
        }

    }
}
