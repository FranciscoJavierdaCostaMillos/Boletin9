package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin9_4 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero para multiplicar"));
        
        if (numero == 0){
            System.exit(0);
        }
        else {
            for (int i=0; i<=10;i++){
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
        }
        
    }
    
}
