package di.example.practice.singleton;

public class SingletonService {
    //1. static 영역에 객체를 1개만 생성한다.
    private  static final SingletonService instance = new SingletonService();

    //2, 객체 인스턴스가 필요하면 아래 public static 메서드를 통해서만 조회할 수 있도록 한다.
    public static SingletonService getInstance(){
        return instance;
    }

    //3. 생성자를 private로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 제한한다.
    private SingletonService(){}

    public void logic(){
        System.out.println("싱글톤 객체를 호출합니다.");
    }
}
