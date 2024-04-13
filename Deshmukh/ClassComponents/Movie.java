package ClassComponents;

public class Movie {
    int movieId;
    String movieName;
    int movieprice;

    public Movie() {
    }

    public Movie(int movieId) {
        this.movieId = movieId;
    }

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public Movie(int movieId, String movieName, int movieprice) {

        this.movieId = movieId;
        this.movieName = movieName;
        this.movieprice = movieprice;
    }

    public static void main(String[] args) {
        Movie Movie = new Movie(1, "Flash", 1000);
        System.out.println("Movie  :" + Movie.movieId + "\t" + Movie.movieName + "\t" + Movie.movieprice);

        Movie Movie1 = new Movie();
        System.out.println("Movie  :" + Movie1.movieId + "\t" + Movie1.movieName + "\t" + Movie1.movieprice);


    }
}
