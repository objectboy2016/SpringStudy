/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 注入方式.setter方法注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
//        Printer p=new JSONPrinter();
//        p.print();

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"注入方式\\setter方法注入\\Beans.xml"});
        OutputHelper outputHelper = context.getBean("outputHelper", OutputHelper.class);
        outputHelper.print();
    }
}
