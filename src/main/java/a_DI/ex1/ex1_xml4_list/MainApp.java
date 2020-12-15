package a_DI.ex1.ex1_xml4_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("a_DI_xml/appContext_ex1_xml4_list.xml");

        ListBean listBean = applicationContext.getBean("listBean", ListBean.class);
        for (int number : listBean.getIntList()) {
            System.out.println(number);
        }

        ListBean memberBean = applicationContext.getBean("listBean", ListBean.class);
        for (MemberBean member : listBean.getMemberList()) {
            member.output();
        }
    }
}
