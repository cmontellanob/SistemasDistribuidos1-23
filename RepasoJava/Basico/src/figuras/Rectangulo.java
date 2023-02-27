/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Carlos
 */
public class Rectangulo implements IFigura {

    private Integer largo;
    private Integer alto;

    public Rectangulo(Integer largo, Integer alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    @Override
    public Integer calcularArea() {
     return largo*alto;
    }

}
