/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 装配bean;
 

/**
 *
 * @author Administrator
 */ 
public class SgtPeppers implements CompactDisc {

    private String title = "SgtPeppers tile ";
    private String artist = "SgtPeppers artist ";

    @Override
    public void play() {
        System.out.println("装配bean.SgtPeppers.play()");
    }
}
