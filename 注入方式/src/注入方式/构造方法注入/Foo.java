/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 注入方式.构造方法注入;

/**
 *
 * @author Administrator
 */
public class Foo {

    private Bar bar;
    private Baz baz;

    public Foo(Bar bar, Baz baz) {
        this.bar = bar;
        this.baz = baz;

        System.out.println("构造方法调用Foo类 ,Bar类的name=" + bar.getName() + ",age=" + bar.getAge());
    }
}
