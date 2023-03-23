/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoermi;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
class Respuesta implements Serializable {
    String[][] tablero;
    Estado estado;
    Ganador ganador;
    String turno;
}
