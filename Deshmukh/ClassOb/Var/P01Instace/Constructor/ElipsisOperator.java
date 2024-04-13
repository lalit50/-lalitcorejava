package ClassOb.Var.P01Instace.Constructor;

public class ElipsisOperator {
    public static void main(String[] args) {
        final int i = 20;
        //        i = 30;
        //System.out.println(add(10, 20));
        display(10, 20, 30, 40);
        System.out.println();
        display(10, 20, 30);
        System.out.println("\n\n\n");
        displaystr("ted", "mark", "maiby");
        System.out.println("\n\n\n\n\n");
        displaystr("jona", "Eli", "tom","jene");
        System.out.println();
    }

    private static int add(final int i, final int i1) {
        return i + i1;
    }

    private static void display(int... Array) {
        //System.out.println(a.length);

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + ",");
        }
    }

    private static void displaystr(String... Array) {
        //System.out.println(a.length);

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + ",");
        }

    }

}