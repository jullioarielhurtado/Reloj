/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.factory;

import reloj.framework.kernel.RelojRunner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pmage
 */
public class HCIRelojFactory {
    
    public RelojRunner crearHCIReloj(String name){
        try {
            RelojRunner hcR= (RelojRunner) Class.forName(name).newInstance();
            return hcR;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(HCIRelojFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
}
