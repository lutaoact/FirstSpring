public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("this is helloworld constructor");
    }

    public void setName(String name) {
        System.out.println("this is setName");
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello: " + name);
    }
}
