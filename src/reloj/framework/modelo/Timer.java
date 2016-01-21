/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pmage
 */
class Timer {
    
    void dormir(){
            try {
                    synchronized(this){
                    this.wait(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
}
