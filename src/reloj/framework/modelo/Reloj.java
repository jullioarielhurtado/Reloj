/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.modelo;
import reloj.framework.observer.Observable;


/**
 *
 * @author pmage
 */
public class Reloj extends Observable implements Runnable{
    
    private Manecilla menorManecilla;
    private boolean detenido;
    
    public Reloj(Manecilla menor){
     this.setMenorManecilla(menor);   
    }
    
    public void arrancar(){
        Thread hiloReloj = new Thread(this);
        detenido=false;
        this.notifify();
        if( getMenorManecilla()!=null) 
             hiloReloj.start();
    }
    
    public String obtenerHora(){
        String hora="";
        if(getMenorManecilla()!=null) hora = getMenorManecilla().obtenerHora();
        return hora;
    }

    /**
     * @return the menorManecilla
     */
    public Manecilla getMenorManecilla() {
        return menorManecilla;
    }

    /**
     * @param menorManecilla the menorManecilla to set
     */
    private void setMenorManecilla(Manecilla menorManecilla) {
        this.menorManecilla = menorManecilla;
    }
    
    public void avanzar(){
                getMenorManecilla().incrementar();
                this.notifify(); 
}

    @Override
    public void run() {
            Timer t = new Timer();
            while(!detenido){
                   avanzar();
                   t.dormir();
             }
        
    }

    public void parar() {
        detenido=true;
        this.notifify();
    }

    public boolean isDetenido() {
         return detenido;
    }
}
    

