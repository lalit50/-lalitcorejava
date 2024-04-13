package oops.Polymorphism.MethodOverrinding;

public class MessageServiceIMPL extends MessageService{

    public void sendMessage(String meddage,int sendMoney){
        System.out.println("sending message with Whats app\t\t =\t"+meddage+"\t\t"+sendMoney);
    }

    public static void main(String[] args) {
        MessageService messageServiceRef =new MessageServiceIMPL();
        messageServiceRef.sendMesage("hello",2000);


        MessageServiceIMPL messageServiceIMPLRef =new MessageServiceIMPL();
        messageServiceIMPLRef.sendMessage("very good morning",2000);


    }

}
