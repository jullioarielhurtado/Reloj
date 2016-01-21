/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.app.cronometro;

import reloj.framework.command.CommandReloj;
import reloj.framework.modelo.*;
import reloj.framework.presentacion.*;
import reloj.remote.*;

/**
 *
 * @author pmage
 */
public class CronometroApp extends reloj.framework.kernel.RelojRunner{
    private reloj.framework.modelo.Reloj cronometro;
    private CommandReloj arrancarCommand;
    private CommandReloj detenerCommand;
    //Tprivate RelojDigitalConsola despliegueConsola;
    private RelojDigitalGrafico despliegueGrafico;
    private ObserverProxy proxyDisplay;
    
    @Override
    public void crearReloj() {
       //To change body of generated methods, choose Tools | Templates.
        Manecilla seg;
        seg = new Manecilla(40,60,0,1,null);
        cronometro = new Reloj(seg);
    }

    @Override
    public void conectarReloj() {
       //To change body of generated methods, choose Tools | Templates.
        proxyDisplay = new ObserverProxy();
        despliegueGrafico = new RelojDigitalGrafico(cronometro);
        cronometro.addObserver(proxyDisplay);
        cronometro.addObserver(despliegueGrafico);
    }
    
}
