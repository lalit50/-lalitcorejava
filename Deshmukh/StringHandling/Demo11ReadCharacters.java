package StringHandling;

public class Demo11ReadCharacters {
    public static void main(String[] args) {
        String str1 = "welcome to IT Shaala";
        String str = "lalit";
        for (int index = 0; index < str.length(); index++) {
            System.out.print(str.charAt(index)+ " ");

        }
        System.out.println(str.length());
        for (int k=str.length()-1 ; k >= 0 ; k--) {
            System.out.print(str.charAt(k)+" ");

        }
    }
}