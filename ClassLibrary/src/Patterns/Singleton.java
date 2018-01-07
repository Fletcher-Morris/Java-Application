/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

/**
 *
 * @author odmoa
 */
public class Singleton {
    
    private Singleton(){}
    
    private static class SingletonContainer{
        
        private static final Singleton SINGLEINSTANCE = new Singleton();
    }
    
    public static Singleton GetInstance(){
        
        return SingletonContainer.SINGLEINSTANCE;
    }
}
