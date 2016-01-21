/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.presentacion;
import reloj.framework.modelo.Reloj;
import reloj.framework.observer.Observable;

/**
 *
 * @author pmage
 */
public class RelojDigitalConsola implements reloj.framework.presentacion.DespliegueReloj{ 

      private Reloj relojito;
      private reloj.app.cronometro.EncenderRelojCommand arrancarCommand;
      private reloj.app.cronometro.DetenerRelojCommand detenerCommand;
    
     public RelojDigitalConsola(Reloj relojito) {
        this.relojito = relojito;
        arrancarCommand = new reloj.app.cronometro.EncenderRelojCommand(relojito);
        detenerCommand = new reloj.app.cronometro.DetenerRelojCommand(relojito);
        // arrancarCommand.ejecutarOrden();
 
     }

    @Override
    public void upDate(Observable o) {
        System.out.println(relojito.obtenerHora());
    }
}
