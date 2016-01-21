/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.observer;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author pmage
 */
public class Observable {
    LinkedList<Observer> observadores;
    
    public void addObserver(Observer obs){
        if(observadores == null) observadores = new LinkedList<Observer>();
        observadores.add(obs);
    }
    
    public void notifify(){
        for(Iterator<Observer> i = observadores.iterator(); i.hasNext(); ){
            i.next().upDate(this);
        }
            
    }
    
}
