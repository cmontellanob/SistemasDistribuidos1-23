/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univesidad;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class Diploma implements Serializable {
    private String nombrecompleto;
    private String carrera;
    private String fecha;
    private String mensaje;

    public Diploma(String nombrecompleto, String carrera, String fecha, String mensaje) {
        this.nombrecompleto = nombrecompleto;
        this.carrera = carrera;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Diploma{" + "nombrecompleto=" + nombrecompleto + ", carrera=" + carrera + ", fecha=" + fecha + '}';
    }
  
    
    
}
