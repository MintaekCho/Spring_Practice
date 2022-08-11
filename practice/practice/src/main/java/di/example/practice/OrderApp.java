package di.example.practice;

import di.example.practice.discount.CurrentDiscountInfo;
import di.example.practice.discount.RateDiscountInfo;
import di.example.practice.order.Order;
import di.example.practice.order.OrderService;
import di.example.practice.user.User;
import di.example.practice.user.UserGrade;
import di.example.practice.user.UserService;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        OrderService orderService = appConfig.orderService();

        Long userId = 0L;
        User user = new User(userId, "larva", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(userId, "coffee", 5000);

        System.out.println("order = " +order);

        /*RateDiscountInfo discountInfo = new RateDiscountInfo();

        User user = new User(0L, "kimcoding", UserGrade.GRADE_1);
        int discountedPrice = discountInfo.discount(user, 5000);

        if(discountedPrice == 500){
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
            System.out.println("1등급 회원으로 5000 -> " + discountedPrice);
        }

        user = new User(0L, "leejava", UserGrade.GRADE_2);
        discountedPrice = discountInfo.discount(user, 5000);

        if(discountedPrice == 1000) {
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
            System.out.println("2등급 회원으로 5000 -> " + discountedPrice);
        }*/
    }
}
