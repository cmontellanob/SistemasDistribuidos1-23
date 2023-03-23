/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rmihola;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class RmiHola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       System.out.print("Introduzca su nombre");
       String nombre=sc.next();
       IHola hola;
       
        try {
            hola = (IHola)Naming.lookup("rmi://localhost/Saludo"); // instanciar un objeto remoto
            System.out.println(hola.HolaMundo(nombre));
            
        } catch (NotBoundException ex) {
            Logger.getLogger(RmiHola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RmiHola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RmiHola.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
