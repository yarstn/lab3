import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchasedMediaList;
    private ArrayList<Media> shoppingCart;


    public User(String username, String email, ArrayList<Media> purchasedMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = purchasedMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media) {
        this.shoppingCart.add(media);
        System.out.println("the "+media+" added to the cart..");
    }

    public void removeFromCart(Media media) {
        this.shoppingCart.remove(media);
        System.out.println("the "+media+" removed from the cart..");

    }

    public void checkout() {
        purchasedMediaList.addAll(shoppingCart);
        System.out.println("checkout done successfuly.. see you again "+username);
        shoppingCart.clear();
   }

}
