/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import java.time.LocalTime;

/**
 *
 * @author Carlos
 */
public class Horario {
    Dia dia;
    LocalTime hora;
    String aula;

    public Horario(Dia dia, LocalTime hora, String aula) {
        this.dia = dia;
        this.hora = hora;
        this.aula = aula;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Horario{" + "dia=" + dia + ", hora=" + hora + ", aula=" + aula + '}';
    }
    
}
