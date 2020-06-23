package factory;

/**
 *
 * @author kike6
 */
public class Triangulo implements Ifigura {
   float base,altura,areaT,perimeT;
    
    

    @Override
    public String area(float base,float altura) {
        return Float.toString((base*altura)/2);
    }

    @Override
    public String perimetro(float cateto1,float cateto2) {
        float hipotenusa = (float)Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
        return Float.toString(cateto1+cateto2+hipotenusa);
    }

    @Override
    public String descripcion(float base,float altura) {
        return "Este es un Triangulo con una base de: " + base+" x "+ altura+" de alto";
    }
    
}
