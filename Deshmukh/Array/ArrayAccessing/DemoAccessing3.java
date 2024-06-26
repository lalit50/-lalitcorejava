package Array.ArrayAccessing;

public class DemoAccessing3 {
    static void left_rotate(int[] arr)
    {
        int last = arr[0];
        for (int i = 3;
             i < arr.length;
             i = i + 2) {
            arr[i - 2] = arr[i];
        }
        arr[arr.length - 1] = last;
    }

    // function to right rotate
    static void right_rotate(int[] arr)
    {
        int start = arr[arr.length - 2];
        for (int i = arr.length - 4;
             i >= 0;
             i = i - 2) {
            arr[i + 2] = arr[i];
        }
        arr[0] = start;
    }

    // Function to rotate the array
    public static void rotate(int arr[])
    {
        left_rotate(arr);
        right_rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        rotate(arr);
    }
}


