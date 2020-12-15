package a_DI.ex3_autowiring;

import javax.annotation.Resource;

public class MessageBeanImpl implements MessageBean{

    //@Autowired
    //@Qualifier("outputer2")
    @Resource(name="outputer2")
    private Outputer outputer;

    private String name;
    private String message;

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(name + "님께 [" + message + "] 전달");
        try {
            outputer.writeMessage(name + "님께 [" + message + "] 전달");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
