/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.sincronizar;
import reloj.framework.modelo.*;

/**
 *
 * @author pmage
 */
public class SincronizadorDoble extends Sincronizador{
    Reloj uno;
    Reloj dos;
   
    public SincronizadorDoble(Reloj a, Reloj b){
        uno = a;
        dos = b;
    }
    
    @Override
    
    protected void sincronizar(Reloj r) {
    if(r.equals(uno) && uno.isDetenido()){   
        dos.arrancar();
    }       
    if(r.equals(dos) && dos.isDetenido()){
        uno.arrancar();
    }
    }
}
