/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresarimeticos;

/**
 *
 * @author Jean Carlos
 */
public class OperadoresArimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        
        int numero = 10;
        int valor = 4 + --numero;
        System.out.println(valor);
        System.out.println(numero);
        
        
        int x = 4;
        x += 2;
        System.out.println(x);
        
        
        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        */
        
        double ale = Math.random();
        int n = (int) (14 + ale * (16-14));
        System.out.println(ale);
        System.out.println(n);
    }
    
}
