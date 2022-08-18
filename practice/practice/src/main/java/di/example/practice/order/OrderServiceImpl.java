package di.example.practice.order;

import di.example.practice.discount.CurrentDiscountInfo;
import di.example.practice.discount.DiscountInfo;
import di.example.practice.user.User;
import di.example.practice.user.UserRepository;
import di.example.practice.user.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

   // private final UserRepository userRepository = new UserRepositoryImpl();
    //private final DiscountInfo discountInfo = new CurrentDiscountInfo();

    private  final UserRepository userRepository;
    private  final DiscountInfo discountInfo;

    @Autowired
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
