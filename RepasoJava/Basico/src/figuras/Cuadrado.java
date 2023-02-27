/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Carlos
 */
public class Cuadrado implements IFigura {
    private Integer lado;

    public Cuadrado(Integer lado) {
        this.lado = lado;
    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }
    
    @Override
    public Integer calcularArea() {
        return lado*lado;
    }
    
}
