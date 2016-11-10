
package boletin9_1;

/**
 *
 * @author fdacostamillos
 */
public class Boletin9_1 {

    
    public static void main(String[] args) {
       int[] conjunto = {-1,2,3,0,-4,12,0,3,0,-21};
       int pos = 0, neg = 0, cero=0 ;
       
       for(int i=0; i<conjunto.length;i++){
           if(conjunto[i]>0){
               pos+=1;
           }
           else if(conjunto[i]<0){
               neg+=1;
           }
           else if(conjunto[i]==0){
               cero+=1;
           }
       }
       System.out.println("Hay " + pos + " numeros positivos, hay " + neg + " numeros positivos y hay " + cero + " ceros");
       
    }
    
}
