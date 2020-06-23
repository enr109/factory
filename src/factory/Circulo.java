/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author kike6
 */
public class Circulo implements Ifigura{
    double area,perimetro;

    @Override
    public String area(float base,float altura) {
        area = Math.PI*(base*base);
        return "El area de un circulo: "+ area;
    }

    @Override
    public String perimetro(float base,float altura) {
        perimetro = 2*Math.PI*base;
        return "El perimetro del circulo es:"+ perimetro;
    }

    @Override
    public String descripcion(float base,float altura) {
        return "El circulo tiene un radio de: " + base;
    }
    
}
