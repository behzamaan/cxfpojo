package ir.mb.cxf.pojo;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String greetings(String text) {
        return "Hi " + text;
    }
}
