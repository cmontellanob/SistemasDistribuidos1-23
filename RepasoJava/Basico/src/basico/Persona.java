/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Carlos
 */
public abstract class Persona {
    protected String nombres;
    protected String apellidos;

    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public abstract void mostrar();
    
    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    
}
