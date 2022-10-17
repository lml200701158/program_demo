
import com.aop.Louzai;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Louzai louzai = (Louzai) context.getBean("louzai");
        louzai.everyDay();
    }
}
