import java.util.List;

public class Music extends Media{
    private String artist;

public void listen (User user){
    for (Media media : user.getPurchasedMediaList()) {
        System.out.println("you are listening now.. enjoy");
        break;
    }
}
//generate playlist
//    (List<Music> musicCatalog)
    public List<Music> generatePlaylist(List<Music> musicCatalog){
    return generatePlaylist(musicCatalog);
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getMediaType() {
        if (getPrice() >= 10) {
            return "Premium Music";
        }else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return "Music: " +
                "artist=" + artist +super.toString();

    }
}
