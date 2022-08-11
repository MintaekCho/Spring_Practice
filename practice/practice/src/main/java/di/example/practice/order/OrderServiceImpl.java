package di.example.practice.order;

import di.example.practice.discount.CurrentDiscountInfo;
import di.example.practice.discount.DiscountInfo;
import di.example.practice.user.User;
import di.example.practice.user.UserRepository;
import di.example.practice.user.UserRepositoryImpl;

public class OrderServiceImpl implements OrderService {

   // private final UserRepository userRepository = new UserRepositoryImpl();
    //private final DiscountInfo discountInfo = new CurrentDiscountInfo();

    private  final UserRepository userRepository;
    private  final DiscountInfo discountInfo;

    public OrderServiceImpl(UserRepository userRepository, DiscountInfo discountInfo){
        this.userRepository = userRepository;
        this.discountInfo = discountInfo;
    }

    @Override
    public Order createOrder(Long userId, String itemName, int itemPrice) {
        User user  = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user, itemPrice);

        return new Order(userId, itemName, itemPrice, discountPrice);
    }
}
