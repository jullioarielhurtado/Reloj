/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.app.relojbasico;
import reloj.framework.presentacion.RelojDigitalGrafico;
import reloj.framework.kernel.RelojRunner;
import reloj.framework.modelo.*;


/**
 *
 * @author pmage
 */
public class AppRelojBasico extends RelojRunner{
    private Reloj miReloj;
    private Alarma alarmita;
    private reloj.framework.presentacion.DespliegueReloj displayR;
    
    @Override
    public void crearReloj() {
        //To change body of generated methods, choose Tools | Templates.
        
        Manecilla horaria = new Manecilla(23,24,0,1,null);
        Manecilla minutera = new Manecilla(59,60,0,1,horaria);
        Manecilla segundera = new Manecilla(40,60,0,1,minutera);
        miReloj = new Reloj(segundera);
    }

    @Override
    public void conectarReloj() {
        //To change body of generated methods, choose Tools | Templates.
        alarmita = new Alarma("23:59:57",miReloj,"Buenos Días Dijo el Principito");
        miReloj.addObserver(alarmita);
        alarmita.setVisible(false);
        displayR = new RelojDigitalGrafico(miReloj);
        miReloj.addObserver(displayR);
        
        
        
     
    }
}
