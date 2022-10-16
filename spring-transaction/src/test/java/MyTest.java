
import com.mybatis.controller.Louzai;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) throws Exception {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Louzai uc = (Louzai) applicationContext.getBean("userController");
        uc.testSuccess();
    }
}
