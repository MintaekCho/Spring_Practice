package di.example.practice;

import di.example.practice.user.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTest {

    public static void main(String[] args) {
        ApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = ac.getBean(UserService.class);
        System.out.println(UserService.class.isInstance(userService));
    }
}
