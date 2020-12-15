package a_DI.ex1.ex1_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // log4J

        // 0. POJO 기존 자바 형식
        /*MessageBean bean = new MessageBeanEnImpl();
        bean.sayHello("hong");
        MessageBean bean2 = new MessageBeanKoImpl();
        bean2.sayHello("홍");*/

        // 1. DI
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");
        MessageBean bean3 = (MessageBean) context.getBean("ko");
        bean3.sayHello("홍길동");
        MessageBean bean4 = context.getBean("en", MessageBean.class);
        bean4.sayHello("gilja");
        context.getBean("ko", MessageBean.class).sayHello("이러케");

    }
}
