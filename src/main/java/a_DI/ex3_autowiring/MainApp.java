package a_DI.ex3_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(
                        "a_DI_xml/appContext_ex3_autowiring.xml");

        MessageBean bean = applicationContext.getBean(MessageBean.class);
        bean.sayHello();
    }
}
