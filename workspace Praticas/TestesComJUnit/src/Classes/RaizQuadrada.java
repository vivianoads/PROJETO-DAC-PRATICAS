/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Luciano
 */
public class RaizQuadrada {
    
    public double getRaiz(double numero){
        double n = -1;
        if(numero >= 0){
            n = Math.sqrt(numero);
        }
         return n;
    }
    
    public boolean isPar(double numero){
        return (numero % 2 ==0);
    }
   
}
