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
public class Baz {

    private String name;
    private int age;

    public Baz(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ",age=" + age;
    }
}
