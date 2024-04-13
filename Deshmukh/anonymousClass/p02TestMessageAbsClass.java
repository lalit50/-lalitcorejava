package anonymousClass;

public class p02TestMessageAbsClass {
    public static void main(String[] args) {
        p02messageServiceAbsClass messageServiceAbsClassRef = new p02MessageServiceAbsClassImpl();
        messageServiceAbsClassRef.sendMessage();
    }
}
