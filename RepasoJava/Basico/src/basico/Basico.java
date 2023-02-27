/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basico;

import java.time.LocalTime;
import java.util.ArrayList;
import figuras.*;
/**
 *
 * @author Carlos
 */
public class Basico {

    /**
     * @param args the command line arguments
     */
    public static void mostrar(Persona p){
        p.mostrar();
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Alumno alumno=new Alumno("Juan", "Perez", "35-239", Carrera.Sistemas);
        Alumno alumno2=new Alumno("Maria", "Limachi", "35-1239", Carrera.Sistemas);
        System.out.println(alumno);
        
        ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
        listaAlumnos.add(alumno);
        listaAlumnos.add(alumno);
        Docente docente=new Docente("Carlos", "Montellano", "1354654");
        Horario horario1= new Horario(Dia.Lunes, LocalTime.of(14, 0), "B205");
        Horario horario2= new Horario(Dia.Jueves, LocalTime.of(16, 0), "F30");
        Horario[] horarios=new Horario[2];
        horarios[0]=horario1;
        horarios[1]=horario2;
        Materia materia=new Materia("Sistemas Distribuidos", "SIS 258", listaAlumnos, docente,horarios);
        
        materia.listarAlumnos();
        Basico.mostrar(alumno);
        Basico.mostrar(docente);
        System.out.println("Figuras");
        Cuadrado cuadrado=new Cuadrado(3);
        System.out.print(cuadrado.calcularArea());
        
        Rectangulo rectangulo=new Rectangulo(3,5);
        System.out.print(rectangulo.calcularArea());
        
        // TODO code application logic here
    }
    
}
