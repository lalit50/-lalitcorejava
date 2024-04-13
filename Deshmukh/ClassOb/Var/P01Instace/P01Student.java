package ClassOb.Var.P01Instace;

public class P01Student {
    int Id;
     String  name;
    void register(){
        System.out.println("Registration");
    }
}

class App{
    public static void main(String args[]){
         P01Student  p01StudentRef = new P01Student();

        System.out.println(p01StudentRef.Id);
        System.out.println(p01StudentRef.name);
        p01StudentRef.register();



         P01Student  p01StudentRef02 = new P01Student();

        System.out.println(p01StudentRef02.Id);
        System.out.println(p01StudentRef02.name);
        p01StudentRef02.register();
    }
}
