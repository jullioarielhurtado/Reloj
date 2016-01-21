/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.remote;
import reloj.framework.observer.*;
import java.rmi.registry.*;
import java.rmi.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pmage
 */
public class ObserverProxy implements Observer{
    private String direccionServidor;
    private String puertoServidor = "3232";
    private RelojServer relojServidor; 
    
    @Override
    public void upDate(Observable o) {
        try {
			// obtener el registro
            direccionServidor = (InetAddress.getLocalHost()).toString();
	    Registry registro = LocateRegistry.getRegistry(direccionServidor,
					(new Integer(puertoServidor)).intValue());
			// creando el objeto remoto			
	    relojServidor = (RelojServer) (registro.lookup("displayremoto"));
            relojServidor.upDate(o);
	} catch (RemoteException e){
			System.err.println(e.getMessage());
			e.printStackTrace(); } 
          catch (NotBoundException e) {
			e.printStackTrace();} 
         catch (java.net.UnknownHostException ex) {
            Logger.getLogger(ObserverProxy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }
