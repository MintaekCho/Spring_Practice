package di.example.practice.discount;
import di.example.practice.user.User;

public interface DiscountInfo {
    int discount(User user, int price);
}
