package Array;

public class Demo15cherckArrayContainsDigit {
    public static void main(String[] args) {
        char[]array ={'a','b','x','y','9','@'};
         for (char ch: array) {
             if (ch>='0'&& ch<='9'){
                 System.out.println("Array contains digit "+ch);

             }
        }
    }
}
