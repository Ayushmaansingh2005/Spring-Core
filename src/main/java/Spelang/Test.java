package Spelang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo demo = con.getBean("demo", Demo.class);
        System.out.println(demo);


    }
}
