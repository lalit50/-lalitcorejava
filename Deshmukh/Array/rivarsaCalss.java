package Array;

public class rivarsaCalss {
    public static void main(String[] args) {
        int[] Arrey1 = {-34, 47, -87, 46, 65};
        for (int i = 0; i < Arrey1.length; i++) {
            System.out.println(Arrey1[i]);
        }
        int left = 0;
        int extra = 0;
        int right = Arrey1.length - 1;
        for (int i = 0; i < Arrey1.length; i++) {
            extra = Arrey1[left];
            Arrey1[left] = Arrey1[right];
            Arrey1[right] = extra;
            left++;
            right--;
            if(left >=right){break;}
        }

        System.out.println("revers");
        for (int i = 0; i < Arrey1.length; i++) {
            System.out.print(Arrey1[i] +" ~ ");
        }

    }


}
