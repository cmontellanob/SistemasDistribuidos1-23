package rmihola;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Carlos
 */
public interface IHola extends Remote {
    
    String  HolaMundo(String nombre) throws RemoteException;
    
    
}
