package Array;

public class Demo6AccessingArrayElements {
    public static void main(String[] args) {

        int[] array = {-10, 20, 30, -54};
        System.out.println(array[3]);
        System.out.println(array[1]);
        System.out.println(array[4]);//Array IndexOut Of BoundsException
        System.out.println(array[0]);
        System.out.println(array[2]);

    }
}
