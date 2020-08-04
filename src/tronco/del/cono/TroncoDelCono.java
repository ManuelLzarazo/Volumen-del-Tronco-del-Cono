
package tronco.del.cono;

import java.util.Scanner;

public class TroncoDelCono {

    
    public static void main(String[] args) {
 
        Scanner Teclado =new Scanner(System.in);

        double h1 =0;

        double h2 =0;

        double B1 =0; 

        double B2 =0;
        
        double V1 =0;
        
        double V2 =0;
        
        double Vtc =0;
        
               
    System.out.println("Digite la altura del cono completo");
            h1 = Teclado.nextInt();
       

    System.out.println("Digite la latura del cono deficiente");
            h2 = Teclado.nextInt();
            
    System.out.println("Digite la base del cono completo");
            B1 = Teclado.nextInt();  
            
    System.out.println("Digite la base del cono deficiente");
            B2 = Teclado.nextInt();       
            
            
            V1 = (double)(B1*h1)/3;
                    System.out.println("el volumen del cono completo es"+V1);
                    
          V2 = (double)(B2*h2)/3;
                    System.out.println("el volumen del cono defieciente"+V2);
          
          Vtc = (double)V1-V2;
                    System.out.println("el volumen del tronco del cono es"+Vtc)
          
         }
   
    }
