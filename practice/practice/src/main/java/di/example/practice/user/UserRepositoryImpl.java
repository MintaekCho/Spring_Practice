package di.example.practice.user;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepositoryImpl implements UserRepository {

    private static Map<Long, User> users = new HashMap<>();

    @Override
    public void saveUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User findByUserId(Long userId) {
        return users.get(userId);
    }

}
