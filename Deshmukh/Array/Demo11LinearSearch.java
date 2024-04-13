package Array;

public class Demo11LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 57, 23, 45, 89, 76};
        int keyFind = 597;
        boolean isFound = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == keyFind) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound ? "found " +keyFind: "not found "+keyFind);

    }
}