package di.example.practice;

import di.example.practice.order.OrderService;
import di.example.practice.discount.CurrentDiscountInfo;
import di.example.practice.order.OrderServiceImpl;
import di.example.practice.discount.DiscountInfo;
import di.example.practice.user.UserRepositoryImpl;
import di.example.practice.user.UserRepository;
import di.example.practice.user.UserService;
import di.example.practice.user.UserServiceImpl;

public class AppConfig {
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }

    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }

    public OrderService orderService(){
        return new OrderServiceImpl (userRepository(), discountInfo());
    }

    public DiscountInfo discountInfo(){
        return new CurrentDiscountInfo();
    }
}
