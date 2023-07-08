import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //spring容器，beans注册后，就会全被Spring实例化，且内存只有一份实例
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User)context.getBean("user");
        UserT user2 = (UserT) context.getBean("u3");
        user2.show();
//        System.out.println(user==user2);
    }
}
