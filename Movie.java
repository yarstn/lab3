import java.util.List;
import java.util.stream.Collectors;

public class Movie extends Media{
    private int duration; //min

    public void watch(User user){
        for (Media media : user.getPurchasedMediaList()) {
            System.out.println("you are wtching now");
            break;
        }

    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        return movieCatalog.stream()
                .filter(movie -> movie.getAuteur().equals(this.getAuteur()))
                .collect(Collectors.toList());
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMediaType() {
        if (duration >= 120) {
            return "Long Movie";
        }else {
            return  "Movie";
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +super.toString();

    }
}
