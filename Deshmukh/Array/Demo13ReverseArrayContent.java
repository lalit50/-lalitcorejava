package Array;

public class Demo13ReverseArrayContent {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index] + " ");

        }
    }
}