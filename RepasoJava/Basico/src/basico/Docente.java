/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Carlos
 */
class Docente extends Persona{
    private String ci;

    public Docente(String ci, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.ci = ci;
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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "Docente{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", ci=" + ci + '}';
    }

    @Override
    public void mostrar() {
              System.out.print("mostrar Docente");

    }
    
}
