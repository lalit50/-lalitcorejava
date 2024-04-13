package StringHandling;

public class Demo18Conversion {
    public static void main(String[] args) {
        String str1 = "welcome";
     /*   StringBuilder stringBuilder = str1;//CTE
        StringBuffer stringBuffer = str1; //CTE
        String str2 = new StringBuilder();//CTE
        String str3 = new StringBuffer();//CTE*/

        StringBuilder stringBuilderRef = new StringBuilder(str1);
        StringBuffer stringBufferRef = new StringBuffer(str1);

        String str2 = new String(stringBuilderRef);

        System.out.println(str1);
        System.out.println(stringBuilderRef);
        System.out.println(stringBufferRef);
        System.out.println(str2);
    }
}