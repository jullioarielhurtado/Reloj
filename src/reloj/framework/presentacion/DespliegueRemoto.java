/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj.framework.presentacion;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import reloj.remote.*;
/**
 *
 * @author pmage
 */

public class DespliegueRemoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            new RelojServer();
        } catch (RemoteException ex) {
            Logger.getLogger(DespliegueRemoto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
