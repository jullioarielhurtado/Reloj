/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.sincronizar;
import reloj.framework.observer.*;
import reloj.framework.modelo.*;

/**
 *
 * @author pmage
 */
public abstract class Sincronizador implements Observer{
    protected  abstract void sincronizar(Reloj o);

    @Override
    public void upDate(Observable o) {
        sincronizar((Reloj)o);
    }
}
