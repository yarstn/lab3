import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media {
    private int stock;
    private ArrayList<Integer> reviews;

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Integer> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Integer> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Integer> reviews) {
        this.reviews = reviews;
    }

    public void addReview(int review) {
        this.reviews.add(review);
    }

    public double getAverageRating() {

        int sum = 0;
        for (int review : reviews) {
            sum += review;
        }
        return (double) sum / reviews.size();
    }

    public void purchase(User user) {

        if (stock > 0) {
            user.getPurchasedMediaList();
            stock--;
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }

    }

    public boolean isBestSeller() {
        if (getAverageRating() >= 4.5) {
            return true;
        } else {
            return false;
        }
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("the stock is: " + stock);
    }

    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Best selling book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +super.toString();
    }
}
