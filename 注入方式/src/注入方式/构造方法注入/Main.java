/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 注入方式.构造方法注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("注入方式\\构造方法注入\\Beans.xml");
        Foo foo = (Foo) context.getBean("foo");
        System.out.println("----------------------------------------------------");
        Bar bar = context.getBean("bar", Bar.class);
        System.out.println("Bar类的name=" + bar.getName() + ",age=" + bar.getAge());
        System.out.println("----------------------------------------------------");
        Baz baz = context.getBean("baz", Baz.class);
        System.out.println("Baz类的" + baz.toString());
    }
}
