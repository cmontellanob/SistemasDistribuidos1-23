/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univesidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Universidad extends UnicastRemoteObject implements IUniversidad {

    public Universidad() throws RemoteException {
        super();
    }

    @Override
    public Diploma emitirDiploma(String ci, String nombres, String primerApellido, String segundoApellido, String fechaNacimiento, String carrera) throws RemoteException {
        ISegip segip;
        Diploma diploma = null;
        String apellidos=primerApellido+" "+segundoApellido;
        try {
            segip = (Segip) Naming.lookup("rmi://localhost/Segip"); // instanciar un objeto remoto
            Respuesta respuesta= segip.verificar(ci, nombres, apellidos);

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }
         int port = 5002;
            try {
                Socket client = new Socket("localhost", port);
                PrintStream toServer = new PrintStream(client.getOutputStream());
                BufferedReader fromServer = new BufferedReader(
                        new InputStreamReader(client.getInputStream()));
                toServer.println("SIS-258");
                String result = fromServer.readLine();
                System.out.println("cadena devuelta es: " + result);

            } catch (IOException ex) {
                
            }
        
        return diploma;
    }

}
