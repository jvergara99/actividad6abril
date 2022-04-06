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
public class Circulo extends Figura {
    private double diametro;
    private final double RADIO = diametro / 2;
    private final double PI = 3.1416;
    
    @Override
    public void setLados(int lados) {
        super.setLados(1); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getArea() {
        return (PI*(RADIO*RADIO)); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Circulo(double diametro) {
        this.diametro = diametro;
        setLados( 1 );
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return RADIO;
    }

    public double getPi() {
        return PI;
    }
    
    
}
