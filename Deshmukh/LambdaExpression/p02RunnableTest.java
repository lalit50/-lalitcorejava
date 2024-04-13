package LambdaExpression;

public class p02RunnableTest {
    public static void main(String[] args) {
        Runnable runnableRef = new p02RunnableImpl();
        runnableRef.run();

        Runnable anonymousref = new Runnable() {
            @Override
            public void run() {
                    System.out.println("runing with anonmyous");

            }
        };
        anonymousref.run();

        Runnable  lambdaref =() -> System.out.println("running with lambda");
        lambdaref.run();


        Runnable methodReference = System.out ::println;;
        methodReference.run();

    }
}