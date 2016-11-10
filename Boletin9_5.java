
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin9_5 {

   
    public static void main(String[] args) {
        int numero,suma = 0,contador =0, a=0,b=0,c=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        // 5a)
        for (int i = 0; i<numero; i++){
            System.out.print((suma+=2) + " ");
        }
           System.out.println("");
        //5b)
        for (int i = 0; i<numero; i++){
            if (i%2==0){
                System.out.print(-(contador+=1) + " ");
            }
            else{
                System.out.print("+" + (contador+=1) + " ");
            }
        }
        System.out.println("");
        //5c
        
        a=0;
        b=1;
        
        for (int i = 0; i<numero; i++){
            
                      
            System.out.print(" " + a);
            a = a+b;
            c=a-b;
            b=c;
            
        }
        
        
        }
        
    }
    

