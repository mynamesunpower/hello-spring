package a_DI.ex1.ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("시작");
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("a_DI_xml/appContext_ex1_xml2_ref.xml");

        /*MemberBean bean = applicationContext.getBean("member", MemberBean.class);
        bean.output();

        MemberBean bean2 = applicationContext.getBean("member2", MemberBean.class);
        bean2.output();*/

        MemberDAO dao = applicationContext.getBean("memberDAO", MemberDAO.class);
        dao.insert();
        MemberDAO dao2 = applicationContext.getBean("memberDAO2", MemberDAO.class);
        dao2.insert();

    }
}
