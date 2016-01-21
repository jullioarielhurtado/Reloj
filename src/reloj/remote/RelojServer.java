/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.remote;

import java.net.*;

import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;
import reloj.framework.observer.Observable;
import reloj.framework.observer.Observer;
import reloj.framework.modelo.*;

/**
 *
 * @author pmage
 */
public class RelojServer extends java.rmi.server.UnicastRemoteObject implements ObserverRemoto{
    private int estePuerto;
    private String estaIP;
    private Registry registro;
    
    public RelojServer() throws java.rmi.RemoteException{
        super();
        estePuerto = 3232; 
	try {
                estaIP = (InetAddress.getLocalHost()).toString();
                registro = LocateRegistry.createRegistry(estePuerto);
		registro.rebind("displayremoto", this);
	}
        catch (RemoteException e) { throw new RemoteException("No se puede obtener la direccion IP.");}
        catch (Exception e) { throw new RemoteException("Fallo en la Conexion");}
   }

    @Override
    public void upDate(Observable o) throws RemoteException {
        System.out.println(((Reloj) o).obtenerHora());
    }
}
