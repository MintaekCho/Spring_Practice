package di.example.practice;

import di.example.practice.singleton.SingletonService;
import di.example.practice.user.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonApp {

    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    static UserService userService1 = ac.getBean("userService", UserService.class);
    static UserService userService2 = ac.getBean("userService", UserService.class);

    public static void main(String[] args) {
        System.out.println("userService1 : " + userService1);
        System.out.println("userService2 : " + userService2);
    }
    /*static SingletonService singletonService1 = SingletonService.getInstance();

    static  SingletonService singletonService2 = SingletonService.getInstance();
    public static void main(String[] args) {
        System.out.println("userService1 : " + singletonService1);
        System.out.println("userService2 : " + singletonService2 );
    }*/
}
