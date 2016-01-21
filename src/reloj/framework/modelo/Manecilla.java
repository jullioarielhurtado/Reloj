/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.modelo;

/**
 *
 * @author pmage
 */
public class Manecilla {
   
    private int valor;
    private int incremento;
    private int min;
    private int max;
    private boolean Tope;
    private Manecilla siguienteManecilla;
    
    public Manecilla(){
        max = 100;
    }
    
    public Manecilla(int val, int ma, int mi, int inc, Manecilla siguiente){
        valor = val;
        max=ma;
        min=mi;
        incremento=inc;
        siguienteManecilla = siguiente;
        Tope=false;       
    }
    
    
    public void incrementar(){
        setValor(getValor() + getIncremento());
     if(getValor()>=getMax()) Tope = true;
     if(Tope){
            setValor(getMin());
         if(getSiguienteManecilla()!=null) getSiguienteManecilla().incrementar();
         Tope = false;
            }   
        }

    public String obtenerHora(){
        String hora="";
        if(getSiguienteManecilla()!=null) hora = getSiguienteManecilla().obtenerHora()+":";
        hora = hora + String.format("%02d", getValor());
        return hora;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the incremento
     */
    public int getIncremento() {
        return incremento;
    }

    /**
     * @param incremento the incremento to set
     */
    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return the siguienteManecilla
     */
    public Manecilla getSiguienteManecilla() {
        return siguienteManecilla;
    }

    /**
     * @param siguienteManecilla the siguienteManecilla to set
     */
    public void setSiguienteManecilla(Manecilla siguienteManecilla) {
        this.siguienteManecilla = siguienteManecilla;
    }

}
