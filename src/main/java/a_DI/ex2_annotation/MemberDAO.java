package a_DI.ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
    
    // 3. 필드 기반의 의존성 주입방식
    // ****************
    @Autowired
    private MemberBean member;

    public MemberDAO() {
        System.out.println("DAO의 기본 생성자당");
    }
    /*
    public MemberDAO(MemberBean member) {
        this.member = member;
    }

    public void setMember(MemberBean member) {
        this.member = member;
    }*/

    public void insert() {
        member.output();
    }
}
