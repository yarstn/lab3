import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> media1;

    public Store(ArrayList<User> users, ArrayList<Media> media) {
        this.users = users;
        this.media1 = media;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedia() {
        return media1;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media1 = media;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> displayUsers() {
        for (User user : users) {
            System.out.println("user: " + user.getUsername()+" email: "+user.getEmail());
        }
        return getUsers();
    }

    public void addMedia(Media media) {
media1.add(media);
    }

    public ArrayList<Media> displayMedia() {
        return media1;
    }

    public ArrayList<Media> searchBook(String title) {

        for (Media item : media1) {
            if (item.getTitle().equalsIgnoreCase(title) && item.getMediaType().equals("Book")) {
                System.out.println("The book \"" + title + "\" is found .");
                return media1;
            }
        }

        // Book not found in the purchases
        System.out.println("The book \"" + title + "\" is not found .");
        return null;
    }

    }


