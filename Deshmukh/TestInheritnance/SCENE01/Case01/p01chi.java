package TestInheritnance.SCENE01.Case01;

public class p01chi extends p01Par{
    public static void main(String[] args) {
        p01Par p01ParRef =new p01Par();
        System.out.println("\t\t\t\t  Parent Ref parent Obj");
        System.out.println("\t\t\t\t MarksMarthi"+p01ParRef.MarksMarthi);

        System.out.println("\t\t\t\t Call By Method --- ");
        p01ParRef.parMarthi();
    }
}
