package ClassComponents;

public class Episode {
    int episodeObjectCounter= 0;
    {
        episodeObjectCounter++;
    }
    public static void main(String[] args){
        Episode episode1 = new Episode();
        Episode episode2 = new Episode();
        Episode episode3 = new Episode();
        Episode episode4 = new Episode();
        Episode episode5 = new Episode();
        System.out.println("No.of objects created"+episode1.episodeObjectCounter);

    }
}
