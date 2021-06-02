/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Jean Carlos
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {0, 1, 2, 3, 4, 5};
        System.out.println("Total de casas de N: " + n.length);
        
        for (int c=0; c<n.length; c++) {
            System.out.println("Na posição " + c + " foi encontrado o valor " + n[c]);
        }
    }
    
}
