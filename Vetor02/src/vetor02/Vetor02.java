/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author Jean Carlos
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year = Year.now().getValue();
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (year % 4 != 0 && year % 400 != 0) {
            tot[1] = 28;
            } else if (year % 4 == 0 && year % 100 != 0) {
                tot[1] = 29;
        }
               
        for (int c=0; c<mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias.");
        }
    }
    
}
