package anonymousClass;

public class p02AnonymousMessageAbsClass {
    public static void main(String[] args) {
        p02messageServiceAbsClass p02messageServiceAbsClassRef = new p02messageServiceAbsClass() {
            @Override
            public void sendMessage() {
                System.out.println("sending message using anonymous class mathod p02 By Abs Class");
                System.out.println("sending message using anonymous class mathod p02 By Abs Class");
                System.out.println("sending message using anonymous class mathod p02 By Abs Class");
                System.out.println("sending message using anonymous class mathod p02 By Abs Class");

            }
        };
        p02messageServiceAbsClassRef.sendMessage();
    }
}
