/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univesidad;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ServidorSegip {
    
    public static void main(String[] args) {
    
        try {
            Segip segip=new Segip();
            LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
            Naming.bind("Universidad",segip);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorSegip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorSegip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorSegip.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
