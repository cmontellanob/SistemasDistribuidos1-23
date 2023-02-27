/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Carlos
 */
public class Alumno extends Persona {
   
    private String cu;
    private Carrera carrera;

    public Alumno( String nombres, String apellidos,String cu, Carrera carrera) {
        super(nombres, apellidos);
        this.cu = cu;
        this.carrera = carrera;
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

    public String getCu() {
        return cu;
    }

    public void setCu(String cu) {
        this.cu = cu;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", cu=" + cu + ", carrera=" + carrera + '}';
    }

    @Override
    public void mostrar() {
        System.out.print("mostrar Alumno");
        
    }
    
    
    
}
