package a_DI.ex2_annotation;

import org.springframework.stereotype.Component;

@Component
public class MemberBean {
    private String name;
    private int age;
    private String message;

    public void output() {
        System.out.println(name + "[" + age + "]" + message);
    }

    public MemberBean() {
        name = "X맨";
        age = 20;
        message = "마가 낀 5강";
        System.out.println(name+"["+age+"] says "+message);
    }
    // 1. setter 호출

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // 2. 생성자 호출

    public MemberBean(String name, int age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
        System.out.println("MemberBean 인자 생성자입니다.");
    }

}
