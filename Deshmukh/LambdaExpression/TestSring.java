package LambdaExpression;

public class TestSring {
    public static void main(String[] args) {
        //how many ways are there to create subclass of Functional Interface
        //1. traditional way
        StringProcessor stringProcessor =new Stringrocessorimpl();
        stringProcessor.process("very good praktisa");

        //2. anonymous class
        StringProcessor anonyous =new StringProcessor() {
            @Override
            public void process(String str) {
                System.out.println(str);
            }
        };
        anonyous.process(" im run of the garund");

        //3. lambda expression
        StringProcessor lambda =   str -> {
            System.out.println(str);
        };
        lambda.process("Good marning usig lambda");

        //4. method reference
//        stringProcessor  methodreference = TestSring::new;
//        methodreference.process("");


    }
}
