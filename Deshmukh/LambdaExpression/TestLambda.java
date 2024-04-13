package LambdaExpression;

public class TestLambda {
    public static void main(String[] args) {
        Runnable runnableRef =new Runnable() {
            @Override
            public void run() {
                System.out.println("anonouvous method call");
            }
        };
        runnableRef.run();


        Runnable laRef =()-> System.out.println("lambda method call");
        laRef.run();

//        Runnable
    }
}
