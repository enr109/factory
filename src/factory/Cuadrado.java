package factory;

/**
 *
 * @author kike6
 */
public class Cuadrado implements Ifigura {
    float areaC,perimetroC;

    @Override
    public String area(float base,float altura) {
        areaC=base*4;
        return "El area es: "+areaC;
    }

    @Override
    public String perimetro(float base,float altura) {
        perimetroC=base*base;
        return "El perimetro es: "+perimetroC;
    }

    @Override
    public String descripcion(float base,float altura) {
        return "Este es un cuadrado de: " + base+" x "+ base;
    }
    
    
}
