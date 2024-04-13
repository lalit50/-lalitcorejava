package lambdaRevision;

//import java.util.function.Supplier;

public class LambdaTest2 {
    public static void main(String[] args) {
        Supplier supplier = () ->" Hello";
        System.out.println(supplier.Provide());

        // Coll bye efarans



        Runnable runnable = ()-> System.out.println("running");
        runnable.run();
        }
        
    }

