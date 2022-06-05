import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHello =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCatOne = (Cat) applicationContext.getBean("Cat");
        Cat beanCatTwo = (Cat) applicationContext.getBean("Cat");

        System.out.println(bean.getMessage());

        System.out.println(bean.equals(beanHello));
        System.out.println(beanCatOne.equals(beanCatTwo));
    }
}