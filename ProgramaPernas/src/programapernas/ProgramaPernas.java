/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Jean Carlos
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String tipo;
        
        System.out.print("Quantas pernas? ");
        int pernas = teclado.nextInt();
        
        System.out.print("Isso é ");
        
        switch (pernas) {
            case 1:
                tipo = " um Saci.";
                break;
            case 2:
                tipo = "um Bípede.";
                break;
            case 3:
                tipo = "um Tripé.";
                break;
            case 4:
                tipo = "um Quadrúpede.";
                break;
            case 6: case 8:
                tipo = "uma Aranha.";
                break;
            default:
                tipo = "um ET.";
        } 
        System.out.println(tipo);
    }
    
}
