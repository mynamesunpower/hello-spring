package c_AOP.aop2_xml_order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(
                        "c_AOP_xml/appContext_aop2.xml");

        MemberService memberService = applicationContext.getBean("targetBean", MemberService.class);
        memberService.register();
        System.out.println("===============================");
        memberService.update("홍길동");
    }
}
