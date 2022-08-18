package di.example.practice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImpl implements UserService{

  //  private final UserRepository userRepository = new UserRepositoryImpl();

    private final  UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void signup(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public User findUser(Long userId) {
        return userRepository.findByUserId(userId);
    }
}
