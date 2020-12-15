package a_DI.ex1.ex1_xml4_list;

import java.util.List;

public class ListBean {

    private List<Integer> intList;
    private List<MemberBean> memberList;

    public ListBean() {
        super();
    }

    public ListBean(List<Integer> intList) {
        super();
        this.intList = intList;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }

    public List<MemberBean> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberBean> memberList) {
        this.memberList = memberList;
    }
}
