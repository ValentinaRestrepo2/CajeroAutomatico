/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;

import java.util.Scanner;

/**
 *
 * @author Valentina Restrepo Arboleda
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese el valor a retirar del cajero");
        int money = scaner.nextInt();
        int contador=0;
        int suma=0;
        
        if(money%10000==0){
            int b50=money/50000;
            int b20=money/20000;
            int b10=money/10000;
            System.out.println("10 "+b10);
            System.out.println("20 "+b20);
            System.out.println("50 "+b50);
            if(b50<b20<b10){
                
            }
            System.out.println("El modulo es "+(money%10000));
        }
        
    }

}
