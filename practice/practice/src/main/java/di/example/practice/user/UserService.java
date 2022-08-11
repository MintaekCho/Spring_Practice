package di.example.practice.user;

public interface UserService {

    void signup(User user);
    User findUser(Long userId);
}
