/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 注入方式.setter方法注入;

/**
 *
 * @author Administrator
 */
public class OutputHelper {

    Printer outputGenerator;

    public void setOutputGenerator(Printer outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    public void print() {
        outputGenerator.print();
    }
}
