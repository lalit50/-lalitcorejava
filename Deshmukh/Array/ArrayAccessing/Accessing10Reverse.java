package Array.ArrayAccessing;

public class Accessing10Reverse {
    public static void main(String[] args) {
        int[] numberArray = {11, 21, 31, 41, 51, 52, 62, 72, 82, 92};
        int left = 0;
        int right = numberArray.length - 1;
        System.out.println("\t Even left \t\t\t Odd right ");
        while (left < right) {
            int lefEle = numberArray[left];
            int rigEle = numberArray[right];

            boolean flagOddd = false;
            boolean flagEven = false;

            System.out.println("\t\t " + left + "=" + lefEle + "\t\t " + right + "=" + rigEle);

            if (lefEle % 2 != 0) {
                /* exchange values*/
                flagEven = true;


            }
            if (rigEle % 2 == 0) {
                /* exchange values*/
                flagOddd = true;
            }
            int Temp=numberArray[right];
            numberArray[right]=numberArray[left];
            numberArray[left]=Temp;


            left++;
            right--;
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(" "+numberArray[i]);
        }

    }
}
