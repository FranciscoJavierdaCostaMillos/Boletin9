package boletin.pkg9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin9_3 {

    public static void main(String[] args) {
        int base,altura,area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
        
        if (base>0 && altura>0){
            area = base*altura;
             System.out.println(area);

        }
        else {
            System.out.println("No introducir numeros negativos");
        }

    }
    
}
