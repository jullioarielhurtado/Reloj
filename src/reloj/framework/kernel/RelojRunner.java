/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj.framework.kernel;
import javax.swing.*;
import reloj.framework.factory.HCIRelojFactory;
import reloj.framework.observer.Observer;



/**
 *
 * @author pmage
 */
public abstract class RelojRunner{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //</editor-fold>
            // Uso de una fábrica de la interface, aplica el patrón método de fábrica
            // Con Java Reflection (Simplifica el patrón)
            HCIRelojFactory fabricaInterface = new HCIRelojFactory();
            RelojRunner hciReloj = fabricaInterface.crearHCIReloj(args[0]);
            hciReloj.ejecutarReloj(); // Llamado al método plantilla
        
    }
    public void ejecutarReloj(){
            crearReloj();
            fijarReloj();
            conectarReloj();
    }
    
    public abstract void crearReloj();
    public abstract void conectarReloj();
    public void fijarReloj(){
        // Este es un ejemplo de método Hook
    }
   
}
