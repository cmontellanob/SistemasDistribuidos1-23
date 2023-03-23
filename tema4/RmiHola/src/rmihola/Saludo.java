package rmihola;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Carlos
 */
public class Saludo extends UnicastRemoteObject implements IHola {

    public Saludo() throws RemoteException {
        super();
    }

    @Override
    public String HolaMundo(String nombre) throws RemoteException {
        return "hola mundo"+nombre;
    }

}
