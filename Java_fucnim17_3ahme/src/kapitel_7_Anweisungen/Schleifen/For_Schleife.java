/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_7_Anweisungen.Schleifen;

/**
 *
 * @author Niklas Fuchshofer
 */
public class For_Schleife {
    public static void main(String[] args) {
        int[][] data;
        data = new int [10][10];
        
        //Tabelle erstellen:
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                data[i][j] = (i+1) * (j+1);
            }
        }
        
        //Tabelle ausgeben:
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                System.out.format("%4d" , data[i][j]);
            }
            System.out.println("");
        }
        
        //Produkt größer 43 suchen
        loop1:
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                if(data[i][j] > 43) {
                    System.out.println("");
                    System.out.println(i + " x " + j + " = " + data[i][j]);
                    break loop1;
                }
            }
        }
    }
    
}
