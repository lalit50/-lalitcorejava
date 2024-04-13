package Array.ArrayAccessing;

public class DemoAccessing2 {
    public static void main(String[] args) {
        int[] StudArrey = {1, 2, 3, 4, 5, 6};
        int left = StudArrey[0];
        int right = StudArrey.length;
        for (int i = 0; i <StudArrey.length ; i++) {


            while (StudArrey[0] % 2 == 0) {
                left++;
            }
            while (StudArrey.length % 2 != 0) {
                right--;
            }
            if (left < right) {
                int temp =StudArrey[i];
//              int StudArrey[i]= StudArrey.length;
//                StudArrey.length=temp;

            }
        System.out.println(StudArrey[i]);
        System.out.println(StudArrey.length);
        }

    }
}

