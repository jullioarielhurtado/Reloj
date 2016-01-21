/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.remote;
import java.rmi.*;
import reloj.framework.observer.*;

/**
 *
 * @author pmage
 */
public interface ObserverRemoto extends Remote{
	void upDate(Observable o) throws RemoteException;
}

