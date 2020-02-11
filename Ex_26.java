
package ex_26;

import java.util.Scanner;

public class Ex_26 {

    public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int n1=0,n2=0,contador=0,resultat=0;
            boolean  correcte=false;
      
            
            do{
        System.out.print("Escriu el primer numero: ");
                if (lector.hasNextInt()) 
                    {
                n1= lector.nextInt();
                                                
                correcte=true;
               } else {
                
                correcte=false;
                    lector.nextLine();
                            }
                System.out.print("Escriu el segon numero: ");
                if (lector.hasNextInt()) 
                    {
                n2=lector.nextInt();
                               
                correcte=true;
               } else {
                
                correcte=false;
                    lector.nextLine();
                            }
          }while((n1<=0)||(n2<=0)||(!correcte));
            
            for(contador=1;contador<=n2;contador++){
                resultat= n1*n1;
            }
            System.out.println("El resultat es: "+resultat);
            System.out.println("easy")
         }
}
