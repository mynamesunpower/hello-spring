package a_DI.ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(
                        "a_DI_xml/appContext_ex2_annotation.xml");
        // <context:component-scan base-package="ex2_annotation"/> 에 의해
        // ex2_annotation 패키지의 Component를 스캔한다.
        // 그 결과, MemberBean 클래스에서 @Component가 발견되었고
        // MemberBean 객체를 생성한다. (기본 생성자 함수 호출)
        // MemberDAO 클래스에서 @Component가 발견되었고
        // MemberDAO 객체를 생성한다. (기본 생성자 함수 호출)
        // MemberDAO의 private 변수 member에 @Autowired 발견
        // 그 순간 컨테이너는 변수 member의 데이터 타입(MemberBean)을 확인하고
        // MemberBean 객체가 메모리에 존재하는지를 확인, 그 객체를 member에 주입한다.
        // @Autowired가 붙은 객체가 메모리에 없다면
        // 컨테이너가 NoSuchBeanDefinitonException 발생

        // **** 빈이름(객체명)은 자동으로 동일한 이름으로 하되 첫글자가 소문자

        // getBean(Class<T>) 로도 사용 가능.
        applicationContext.getBean(MemberDAO.class).insert();

    }
}
