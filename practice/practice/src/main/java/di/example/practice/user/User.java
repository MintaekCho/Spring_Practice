package di.example.practice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {
    private Long id;
    private String name;
    private UserGrade userGrade;


    public Long getId() {
        return id;
    }
    @Autowired
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public UserGrade getUserGrade() {
        return userGrade;
    }
    @Autowired
    public void setUserGrade(UserGrade userGrade) {
        this.userGrade = userGrade;
    }

    public User(Long id, String name, UserGrade userGrade){
        this.id = id;
        this.name = name;
        this.userGrade = userGrade;


    }
}
