/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesssystem;

import gui.SystemUi;
import Util.*;

/**
 *
 * @author odmoa
 */
public class AccessSystem {

    public static UniAccessSystem system;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        system = new UniAccessSystem();
        SystemUi.SetUniSystem(system);
        SystemUi.main(args);
    }
}