package anonymousClass;

public class p03ChildClass {
    public static void main(String[] args) {
        p03parent p03parentRef =new p03parent(){
            @Override
            void m1() {
                super.m1();
                System.out.println("m1 in p03ChildClass");
                System.out.println("m1 in p03ChildClass");
            }
        };
        p03parentRef.m1();
    }
}
