/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Luciano
 */
public interface Calculadora {
    public double soma(double a, double b);
    public double subtrai(double a, double b);
    public double mulitplica(double a, double b);
    public double divide(double a, double b)throws DivisaoPorZeroException;
    
}
