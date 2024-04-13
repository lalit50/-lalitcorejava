package anonymousClass;

public class p04MusicTest {
    public static void main(String[] args) {
        //Fifferent Way to create subclass of music service
        // 1. traditional wy of creating subclass
        p04MusicServiceParent p04MusicServiceParentRef =new p04MusiceServiceImplChaild();
        p04MusicServiceParentRef.play("play song........");


        //2.using anonymous class
        p04MusicServiceParent anonymous =new p04MusiceServiceImplChaild(){
            @Override
            public void play(String songName) {
//                super.play(songName);
                System.out.println("Playing music using anonymous class ="+songName);
            }
        };
        anonymous.play("\t bollywood");

        //3. implementing functional interface using lambda
        p04MusicServiceParent lambdaref = songName -> System.out.println("playing music "+songName);

        lambdaref.play("playing for lambda");


    };

}
