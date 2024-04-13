package StringHandling;

public class Demo13Splitting {
    public static void main(String[] args) {
        String str = "Ajay,Vijay,Amitabh,Govinda,Salman";
        //delimiter : ,
        String[] words = str.split(",");
        String[] array = {"Ajay", "Vijay", "Amitabh", "Govinda", "Salman"};
        for (int index = 0; index < words.length; index++) {
            System.out.print(words[index]+" ");
        }
        String str2 = "lalit - vaybhav - rahula -  om";
        System.out.println("\n\n\t\t New String : " + str2);
        String[] wordArry = str2.split("-");
        System.out.print("\t\t Array is : ");
        for (int index = 0; index < wordArry.length; index++) {
            System.out.print(wordArry[index] + "\t\t");
        }
        System.out.println("\n\n for each loop");
        for (String element : wordArry) {
            System.out.print(element + " ");
        }


    }
}