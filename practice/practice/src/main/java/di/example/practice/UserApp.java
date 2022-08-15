package di.example.practice;
import di.example.practice.user.User;
import di.example.practice.user.UserGrade;
import di.example.practice.user.UserService;
import di.example.practice.user.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserApp {
    public static void main(String[] args) {
       // UserService userService = new UserServiceImpl();
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ac.getBean("userService", UserService.class);

        User user = new User(0L, "kimcoding", UserGrade.GRADE_2);
        userService.signup(user);

        User currentUser = userService.findUser(0L);
        System.out.println("signup user : " + user.getName());
        System.out.println("current user : " + currentUser.getName());

        if(user.getName().equals(currentUser.getName())){
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
    }
}
