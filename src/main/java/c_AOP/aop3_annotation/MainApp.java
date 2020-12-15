package c_AOP.aop3_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("c_AOP_xml/appContext_aop3.xml");

        MessageBean bean = applicationContext.getBean("targetBean", MessageBean.class);

        bean.sayHello();
        System.out.println("---------------");
        bean.engSayHello();
        System.out.println("===============");
        bean.test();
    }
}
