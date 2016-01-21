/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.app.relojbasico;
import reloj.framework.command.CommandReloj;
import reloj.framework.modelo.*;

/**
 *
 * @author pmage
 */
public class EncenderRelojCommand extends CommandReloj {
    Reloj unreloj;
    
    public EncenderRelojCommand(Reloj rj){
        unreloj = rj;
    }
    
    @Override
    public void ejecutarOrden() {
        unreloj.arrancar();
    }
    
}
