package a_DI.ex1.ex1_xml1;

public class MessageBeanKoImpl implements MessageBean {

    public MessageBeanKoImpl() {
        System.out.println("메세지 빈 한쿡어 생성욧");
    }

    public void sayHello(String name) {
        System.out.println("안녕하세요, " + name);
    }
}
