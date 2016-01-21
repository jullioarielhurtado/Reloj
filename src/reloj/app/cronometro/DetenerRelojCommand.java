/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.app.cronometro;

import reloj.framework.command.CommandReloj;
import reloj.framework.modelo.Reloj;

/**
 *
 * @author pmage
 */
public class DetenerRelojCommand extends CommandReloj{
private Reloj reloj;

    public DetenerRelojCommand(Reloj rlj) {
        reloj= rlj;
    }
    @Override
    public void ejecutarOrden() {
    reloj.parar();
    }
}