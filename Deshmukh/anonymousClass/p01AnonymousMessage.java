package anonymousClass;

public class p01AnonymousMessage {
    public static void main(String[] args) {
        p01messageServiceInterface p01messageServericeRef = new p01messageServiceInterface() {
            @Override
            public void sendMessage() {
                System.out.println("sending message using anonymous class mathod p01");
                System.out.println("sending message using anonymous class mathod p01");
                System.out.println("sending message using anonymous class mathod p01");
                System.out.println("sending message using anonymous class mathod p01");

            }
        };
        p01messageServericeRef.sendMessage();
    }
}
