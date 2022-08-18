package di.example.practice;

import di.example.practice.order.OrderService;
import di.example.practice.discount.CurrentDiscountInfo;
import di.example.practice.order.OrderServiceImpl;
import di.example.practice.discount.DiscountInfo;
import di.example.practice.user.UserRepositoryImpl;
import di.example.practice.user.UserRepository;
import di.example.practice.user.UserService;
import di.example.practice.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;


@Configuration(excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
@ComponentScan
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }
    @Bean
    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl (userRepository(), discountInfo());
    }
    @Bean
    public DiscountInfo discountInfo(){
        return new CurrentDiscountInfo();
    }
}
