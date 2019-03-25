import me.lutao.bean.Cat;
import me.lutao.bean.Dog;
import me.lutao.bean.Student;
import me.lutao.bean.StudentDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        try {
//            Class.forName("org.springframework.orm.hibernate5.LocalSessionFactoryBean"); //检测需要的类是否存在
//        } catch(ClassNotFoundException e) {
//            System.out.println("not found");
//        }
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        StudentDaoImp studentDaoImp = (StudentDaoImp) context.getBean("studentDaoImp");
//
//
//        String[] ID = { "2008", "2009", "2010", "1990", "2015","2018" };
//        String[] name = { "Wang", "Hui", "Yu", "Yuan", "Yuan", "Yang"};
//        int[] age = { 16, 18, 20, 20, 22, 21 };
//        String[] FM = {"F", "F", "M", "M", "M", "F"};
//
//        Student student = null;
//        List<Student> students = null;
//        for (int i = 0; i < 6; i++) {
//            studentDaoImp.addStudent(new Student(ID[i], name[i], age[i], FM[i]));
//        }
        studentDaoImp.displayAll();
//        HelloWorld helloWorld = (HelloWorld) c.getBean("helloWorld");
//        helloWorld.sayHello();
//
//        HelloWorld helloWorld1 = (HelloWorld) c.getBean("helloWorld");
//        helloWorld1.sayHello();

//        Dog d = (Dog) context.getBean("dog");
//        d.eat();
//        d.la();
//
//        Cat c = (Cat) context.getBean("cat");
//        c.eat();
//        c.la();
    }
}
