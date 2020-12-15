package a_DI.ex1.ex1_xml3_pvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(
                        "a_DI_xml/appContext_ex1_xml3_pvalue.xml");

        /*MemberBean bean = applicationContext.getBean("memberBean", MemberBean.class);
        bean.output();*/

        MemberDAO dao = applicationContext.getBean("memberDAO", MemberDAO.class);
        dao.insert();
    }
}
