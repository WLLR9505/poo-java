
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;

/**
 *
 * @author WLLR9505
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet;
        
        objRet = new Retangulo();
        DecimalFormat df = new DecimalFormat("0.00");
        
        objRet.setAltura(8.0);
        objRet.setBase(5.0);
        System.out.println("Altura: " + df.format(objRet.getAltura()));
        System.out.println("Base: " + df.format(objRet.getBase()));
        System.out.println("Área: " + df.format(objRet.calcArea()));
        System.out.println("Perímetro: " +df.format( objRet.calcPerimetro()));
        System.out.println("Diagonal: " + df.format(objRet.calcDiagonal()));
    }
    
}
