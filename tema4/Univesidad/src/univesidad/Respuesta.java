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
class Respuesta implements Serializable{
   String estado;
   String mensaje;

    public Respuesta(String estado, String mensaje) {
        this.estado = estado;
        this.mensaje = mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "estado=" + estado + ", mensaje=" + mensaje + '}';
    }
   
}
