package c_AOP.aop2_xml_order;

public class MemberServiceImpl implements MemberService {
    @Override
    public void register() {
        System.out.println("register() 함수 호출: 회원가입 되었습니다.");
    }

    @Override
    public boolean update(String memberId) {
        System.out.println("update() 함수 호출: " + memberId + "님 정보가 수정되었습니다.");
        return true;
    }
}
