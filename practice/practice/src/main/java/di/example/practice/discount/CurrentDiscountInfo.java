package di.example.practice.discount;

import di.example.practice.user.User;
import di.example.practice.user.UserGrade;

public class CurrentDiscountInfo implements DiscountInfo {

    private int grade_1_Amount = 500;
    private int grade_2_Amount = 1000;

    @Override
    public int discount(User user, int price) {
        if(user.getUserGrade() == UserGrade.GRADE_1){ //enum 타입을 비교할때는 == 을 사용한다.
            return grade_1_Amount;
        } else if (user.getUserGrade() == UserGrade.GRADE_2) {
            return grade_2_Amount;
        }
        return 0;
        //1,2 등급일 때는 고정 할인 값 grade_number_Amount를 리턴해주고 그 외에는 0을 리턴해준다.
    }
}
