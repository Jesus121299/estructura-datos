
package debi;
import java.util.Scanner;

public class Debi {

    
    public long numbi(int num){
    if(num<2){
        return num;}
    else{
        return num%2+numbi(num/2)*10;
        }
    }
   
    
    
    public static void main(String[] args) {
        Debi nm=new Debi();
        Scanner x = new Scanner (System.in);
        int nu_dec;
        
        System.out.println("Ingrese el numero de base 10: ");
        nu_dec = x.nextInt();
        
        System.out.println("El resultado es; "+ nm.numbi(nu_dec));
        
    }
    
}
