/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univesidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ServidorSeduca {

    public static void main(String[] args) {
        int port = 5002;
        ServerSocket server;
        while (true){
        try {
            server = new ServerSocket(port);
            System.out.println(
                    "Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            String cadena=fromClient.readLine();
            /*
            logica para dar respuesta
            
            */
            toClient = new PrintStream(client.getOutputStream());
            toClient.println("Hola Mundo");

        } catch (IOException ex) {
            Logger.getLogger(ServidorSeduca.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
