package anonymousClass;

public class p01TestMessageInterface {
    public static void main(String[] args) {
        p01messageServiceInterface p01messageServericeRef = new p01MessageServiceInterfaceImpl();
        p01messageServericeRef.sendMessage();
    }
}
