/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.app.ajedrez;
import reloj.app.relojbasico.Alarma;
import reloj.framework.kernel.RelojRunner;
import reloj.framework.modelo.*;
import reloj.framework.presentacion.RelojDigitalGrafico;
import reloj.sincronizar.*;


/**
 *
 * @author pmage
 */
public class AppRelojBasico extends RelojRunner{
    private Reloj miReloj;
    private Reloj otroReloj;
    private Alarma alarmita;
    private reloj.framework.presentacion.DespliegueReloj displayR;
     private reloj.framework.presentacion.DespliegueReloj displayR2;
    
    @Override
    public void crearReloj() {
        //To change body of generated methods, choose Tools | Templates.
        
        Manecilla horaria = new Manecilla(23,24,0,1,null);
        Manecilla minutera = new Manecilla(59,60,0,1,horaria);
        Manecilla segundera = new Manecilla(40,60,0,1,minutera);
        miReloj = new Reloj(segundera);
        
        horaria = new Manecilla(23,24,0,1,null);
        minutera = new Manecilla(59,60,0,1,horaria);
       segundera = new Manecilla(40,60,0,1,minutera);
        otroReloj = new Reloj(segundera);
    }

    @Override
    public void conectarReloj() {
        //To change body of generated methods, choose Tools | Templates.
        alarmita = new Alarma("23:59:57",miReloj,"Buenos Días Dijo el Principito");
        miReloj.addObserver(alarmita);
        alarmita.setVisible(false);
        displayR = new RelojDigitalGrafico(miReloj);
        displayR2 = new RelojDigitalGrafico(otroReloj);
        miReloj.addObserver(displayR);
        otroReloj.addObserver(displayR2);
        Sincronizador sinc;
        sinc = new SincronizadorDoble(miReloj, otroReloj);
        miReloj.addObserver(sinc);
        otroReloj.addObserver(sinc);
    }
}
