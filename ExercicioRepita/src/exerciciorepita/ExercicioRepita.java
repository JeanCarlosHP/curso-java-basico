/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Jean Carlos
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, totalValores = 0, totalPares = 0, totalImpares = 0,soma = 0;
        int acima100 = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            
            totalValores++;
            
            if (n % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
            
            if (n > 100) {
                acima100++;
            }
            soma += n;
        } while (n != 0);
        int media = soma / totalValores;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" +
                "<br>Total de Valores: " + totalValores + 
                "<br>Total Pares: " + totalPares +
                "<br>Total Ímpares: " + totalImpares +
                "<br>Acima de 100: " + acima100 +
                "<br>Média dos valores: " + media + "</html>");
    }
    
}
