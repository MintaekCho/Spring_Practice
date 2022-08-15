package di.example.practice;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefiniitionNames = ac.getBeanDefinitionNames();

        for(String beanDefinitionName : beanDefiniitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinitionNames(beanDefinitionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                System.out.println("beanDefinitionNames = " + beanDefinitionName +
                        ", beanDefinition = " + beanDefinition);
            }
        }
    }
}
