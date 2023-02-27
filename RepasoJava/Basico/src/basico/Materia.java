/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Materia {

    private String nombre;
    private String sigla;
    private ArrayList<Alumno> listaAlumnos;
            
    private Docente docente;
    private Horario[] horarios;

    public Materia(String nombre, String sigla, ArrayList<Alumno> listaAlumnos, Docente docente, Horario[] horarios) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.listaAlumnos = listaAlumnos;
        this.docente = docente;
        this.horarios = horarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Horario[] getHorarios() {
        return horarios;
    }

    public void setHorarios(Horario[] horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", sigla=" + sigla + ", listaAlumnos=" + listaAlumnos + ", docente=" + docente + ", horarios=" + horarios + '}';
    }
  public void listarAlumnos() {
        System.out.println("Lista de Alumnos");
        for (Alumno alumno:listaAlumnos)
        {
            System.out.println(alumno);
        }
    }    
    public  void addAlumno(Alumno a){
        listaAlumnos.add(a);
    }


}
