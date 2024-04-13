package Array;

public class Demo8PrintArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 70, 30, 40};
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print("\t" + array[index]);
        }

    }
}