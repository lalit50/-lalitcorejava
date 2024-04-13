package ClassComponents;

public class OrderService {
    {
        System.out.println("instance block");
    }
    static{
        System.out.println("static block");
    }
    OrderService(){
        System.out.println("zero param constructor");
    }

    public static void main(String[] args) {
        OrderService orderService =new OrderService();

    }
}

