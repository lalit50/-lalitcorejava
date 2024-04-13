package Multithreading;

public class myDemo {
    public static void main(String[] args) {
        //way 1 : Traditional way
        Runnable runnableRef = new MyDemo1();
        runnableRef.run();

        // way 2 annymous class way

        Runnable runnableRef2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runable run method: Task class");
            }
        };
        runnableRef2.run();

        // way 3   lambda way :  Since Runnabe is a functional interface.
        Runnable runnableRef3 = () -> System.out.println(" Runnabe run method : lambda Expression");
        runnableRef3.run();

    }
    // way 4 method  reference


}
