/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Luciano
 */
public class CalculadoraImpl implements Calculadora{

    @Override
    public double soma(double a, double b) {
        return a+b;
    }

    @Override
    public double subtrai(double a, double b) {
        return a-b;
    }

    @Override
    public double mulitplica(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) throws DivisaoPorZeroException {
        double valor = 0;
        try{
        valor =  a/b;
        
       }catch(ArithmeticException ar){
           throw new DivisaoPorZeroException("Divisao nao efetuada" +ar);
       }
        return valor;
    }
    
}
