/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;

/**
 *
 * @author Jesús Kauil
 */
public class Billetes {
    
    public static void bille(int cambi){
        
        int mil,quinientos,doscientos,cien,cincuenta,veinte,diez,cinco,dos,peso;
        
        if(cambi >= 1000){
            mil= cambi/1000;
            System.out.println(mil + " billetes de $1000. \n");
            bille(cambi%1000);
        }else{
            
            if(cambi >=500 && cambi<= 999){
            quinientos= cambi/500;
                System.out.println(quinientos + " billetes de $500\n");
                bille(cambi%500);
        }else{
                if(cambi>=200 && cambi<=499){
                    doscientos= cambi/200;
                    System.out.println( doscientos + " billetes de $200\n");
                    bille(cambi%200);
                }else{
                    
                    if(cambi>= 100 && cambi <= 199){
                      cien= cambi/100;
                    System.out.println(cien + " billetes de $100\n");
                    bille(cambi%100);  
                    
                    }else{
                        
                        if (cambi >=50 && cambi <=99){
                            cincuenta = cambi/50;
                            System.out.println( cincuenta +  " billetes de $50\n");
                            bille(cambi%50);
                        }else{
                        
                        if(cambi>=20 && cambi<=49){
                            veinte = cambi/20;
                    System.out.println( veinte + " billetes de $20\n");
                    bille(cambi%20); 
                            
                        }else{
                            
                            if(cambi>=10 && cambi <= 19){
                                
                                diez = cambi/10;
                                System.out.println( diez + " monedas de $10\n");
                                bille(cambi%10);
                                
                            }else{
                                
                                if(cambi>=5 && cambi <= 9){
                                   cinco = cambi/5;
                                    System.out.println(cinco + " monedas de $5\n" );
                                    bille(cambi%5);
                                }else{
                                    
                                    if(cambi>=2 && cambi<= 4){
                                        
                                        dos = cambi/2;
                                    System.out.println( dos +  " monedas de $2\n");
                                    bille(cambi%2);
                                    }else{
                                        
                                        if(cambi == 1){
                                            peso = cambi/1;
                                            System.out.println( peso + " monedas de $1\n");
                                        }
                                    }
                                   
                                    
                                }
                                
                            }
                        }
                    }
                  }
                    
                }
            }
        }
    
  }
    }
    

