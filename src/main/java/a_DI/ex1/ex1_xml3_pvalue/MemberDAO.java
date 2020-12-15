package a_DI.ex1.ex1_xml3_pvalue;

public class MemberDAO {
    private MemberBean member;

    public MemberDAO() {
    }

    public MemberDAO(MemberBean member) {
        this.member = member;
    }

    public void setMember(MemberBean member) {
        this.member = member;
    }

    public void insert() {
        member.output();
    }
}
