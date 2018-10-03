
package cambio;
import java.util.Scanner;

public class Cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Billetes bil=new Billetes();
        Scanner x = new Scanner (System.in);  
        int efectivo;
        int precio;
        int cam;
        
        System.out.println("Ingrese el efectivo que otorgo; ");
        efectivo = x.nextInt();
        System.out.println("\n Ingrese el precio del producto; ");
        precio = x.nextInt();
        
        
        cam = efectivo - precio;
        
        
        bil.bille(cam);
        
    }
    
}
