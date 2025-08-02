package Lifecyclebean;

import org.example.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.SortedMap;

public class Test {
    public static void main(String[] args){
          AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycle.xml");
//        Bean1 s1 = (Bean1) context.getBean("s1");
//        System.out.println(s1);
//        //registeringShutdown in AbstractApplication method
          context.registerShutdownHook();
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//        Bean2 b2 = (Bean2) context.getBean("b2");
//        System.out.println(b2);
          Bean3 b3 = (Bean3) context.getBean("b3");
        System.out.println(b3);

    }
}
