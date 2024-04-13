package Array;

public class Demo7AccessingArrayWithLoop {
    public static void main(String[] args) {

        int[] array = {-10, 20, 40, -50};
        int arraySize = array.length;//4
        for (int index = 0; index < arraySize; index++) {
            System.out.print("\t" + array[index]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.print(" " + i+" va "+array[i]);
        }
        for (int i = array.length -1; i >= 0; i--) {

            System.out.println();

            System.out.print(" " + i + " va " +array[i]);
        }
        System.out.println("End");
    }
}
