import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> reviewsList = new ArrayList<>();
        ArrayList<Integer> media = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Media> media1 = new ArrayList<>();
        List<Movie> movieCatalog = new ArrayList<>();
        List<Music> musicCatalog = new ArrayList<>();
        List<Integer> reviews = new ArrayList<>();





        Store store = new Store(users, media1);
        User user1 = new User("John Doe","jhon@h.com",new ArrayList<>(),new ArrayList<>());
        User user3 = new User(" Smith","smith@h.com",new ArrayList<>(),new ArrayList<>());
        store.addUser(user1);
        store.addUser(user3);
        store.displayUsers();
        Book book1 = new Book("java book", "sam", "5425874", 42.5, 4, reviewsList);
        User user0 = new User("Mohammed", "mohammed@example.com", new ArrayList<>(), new ArrayList<>());
        User user = new User("yara khalid", "yara@example.com", new ArrayList<>(), new ArrayList<>());
        User user2 = new User("Nasser", "Nasser@example.com", new ArrayList<>(), new ArrayList<>());
        Media book = new Media("The Great Gatsby", "Book", "999", 50);
        Media book2 = new Media("To Kill a Mockingbird", "Book", "799", 30);
        Review r = new Review("yara", "5", "i like the book so much");
        Review r2 = new Review("yara", "3.5", " a little bit boring");
        Movie m1 = new Movie("scream", "james", "5482239", 44, 120);
        Movie m2 = new Movie("the sunset", "sara mcdonald", "2221451", 102, 165);
        Movie m3 = new Movie("FREINDS", "michle", "22377785", 62, 100);
        movieCatalog.add(m1); //add movie movieCatalog
        movieCatalog.add(m2);
        movieCatalog.add(m3);
        Music m4 = new Music("wahashtini", "saham", "22548878", 13.2, "rashed almajed");
        Music m5 = new Music("enta wainak", "ahmed alharami", "77822102", 52, "almoanaa");
        Music m6 = new Music("tjeni", "saham", "00140235", 9, "majed almuhandis");
        musicCatalog.add(m4);
        musicCatalog.add(m5);
        musicCatalog.add(m6);
        Novel n1 = new Novel("new women","jasmin joe","11420357",9.5,3,new ArrayList<>(),"romance");
        Novel n2 = new Novel("the conjuring","boston ","441032500",13,4,new ArrayList<>(),"horror");
        Novel n3 = new Novel("360 hours","ali khalid","1234567",22.7,9,new ArrayList<>(),"adventure");
        AcademicBook b1 = new AcademicBook("java base", "jason hoe", "44201247", 47.0, 4, (ArrayList<Integer>) reviews, "programming");
        AcademicBook b2 = new AcademicBook("the earth", "sara hytr", "9852130", 22, 3, (ArrayList<Integer>) reviews, "nature");
        AcademicBook b3 = new AcademicBook("learn english", "abu hashima", "555487210", 10, 1, (ArrayList<Integer>) reviews, "kids");
        reviews.add(4);
        reviews.add(5);
        reviews.add(3);



        // test book methods
        System.out.println(book1);
        //add the stock und print updated stock
        book1.restock(5);
        //add review
        reviewsList.add(5);
        book1.addReview(4);
        //result of review
        book1.getAverageRating();
        //is java best selling book?
        //print all reviews
        System.out.println(book1.getReviews());
        //get media type
        System.out.println(book2.getMediaType());
        System.out.println(book1.getMediaType());
        book1.purchase(user);
        System.out.println(user.getPurchasedMediaList());
        System.out.println("**************************************");


        // Add some books to the user's purchases User Class
        user.addToCart(book1);
        user.addToCart(book2);
        //search for a book
        store.searchBook("The Great Gatsby");
        //remove media from cart
        user.removeFromCart(book);
        //check out
        user.checkout();

        System.out.println("**************************************");
//print reviews
        System.out.println(r.getUsername() + " rate: " + r.getRating() + " comment: " + r.getComment());
        System.out.println(r2.getUsername() + " rate:  " + r2.getRating() + " comment: " + r2.getComment());
        System.out.println("**************************************");


        //display users user class
        store.addUser(user0);
        store.addUser(user);
        store.addUser(user2);
        store.displayUsers();

        System.out.println("**************************************");
        //Test Movie Class
        System.out.println(m1.getMediaType());
        System.out.println(m3.getMediaType());
        System.out.println(m1.getDuration() + " minutes");
        m1.watch(user);
        System.out.println("This is similar and recommended movies:");
        for (Movie movie : movieCatalog) {
            System.out.println(movie);
        }
        System.out.println("**************************************");
        //Test Music Class
        System.out.println(m4.getMediaType());
        System.out.println(m6.getMediaType());
        m5.listen(user);
        System.out.println("This is the music catalog:");
        for (Music music : musicCatalog) {
            System.out.println(music);
        }
        System.out.println("**************************************");
        //Test Novel Class
        n1.addReview(5);
        n2.addReview(2);
        n3.addReview(4);
        System.out.println(n1.getMediaType());
        System.out.println(n2.getMediaType());
        System.out.println(n1.getAverageRating());
        System.out.println(n1.getGenre());

        //Test Academic Book Class
        System.out.println("**************************************");
        b2.addReview(2);
        b3.addReview(5);
        System.out.println(b1.getMediaType());
        System.out.println(b3.getMediaType());
        System.out.println(b1.getSubject());
        System.out.println(b1);

        System.out.println("**************************************");
        System.out.println(store.displayMedia());








    }
}