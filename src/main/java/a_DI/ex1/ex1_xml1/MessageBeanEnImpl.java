package a_DI.ex1.ex1_xml1;

public class MessageBeanEnImpl implements MessageBean {

    public MessageBeanEnImpl() {
        System.out.println("MessageBean English Impl 생성");
    }

    public void sayHello(String name) {
        System.out.println(name + ", Good Morning");
    }
}
