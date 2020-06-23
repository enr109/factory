package factory;

/**
 *
 * @author kike6
 */
public class Fabrica {
    public static Ifigura fabricar(int id){
        switch(id){
            case 0:
                return new Cuadrado();
            case 1: 
                return new Rectangulo();
            case 2:
                return new Triangulo();
            case 3:
                return new Circulo();
                default:
                    return null;
        }
    }
    
}
