
package palindromo;
import java.util.Scanner;

public class Palindromo {

   
        public static boolean paalin(String palabra){
    if(palabra.length() <= 1){
        return true;
    }else{
        if(palabra.charAt(0) == palabra.charAt(palabra.length() - 1)){
            return paalin(palabra.substring(1,palabra.length() - 1 ) );
        }else{
            return false;
        }
    }   
}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner (System.in);
        String pala;
        String palai;
        
        System.out.println("Ingresa la palabra o frase;     " );
        pala = x.nextLine();
        palai = pala;
        pala=pala.replace(" ", "");
        
        if(paalin(pala) == true){
            System.out.println("La frase o palabra; ''" +palai+ "'' es un palindromo");
    }else{
            System.out.println("La frase o palabra; ''" +palai+ "'' no es un palindromo");
        }
    
    }
    
}


