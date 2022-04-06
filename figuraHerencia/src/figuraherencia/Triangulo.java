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
public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    @Override
    public void setLados(int lados) {
        super.setLados(3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea() {
        return (base * altura)/2; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        setLados( 3 );
    }
    
}
