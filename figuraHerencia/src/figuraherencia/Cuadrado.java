/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuraherencia;

/**
 *
 * @author javie
 */
public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
        setLados( 4 );
    }

    @Override
    public double getArea() {
        return lado*getLados(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
