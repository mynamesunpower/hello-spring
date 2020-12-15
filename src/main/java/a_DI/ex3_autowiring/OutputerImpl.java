package a_DI.ex3_autowiring;

import java.io.FileWriter;

public class OutputerImpl implements Outputer{

    String path;

    public OutputerImpl() {
        super();
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void writeMessage(String msg) throws Exception {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(msg);

        fileWriter.close();
    }
}
