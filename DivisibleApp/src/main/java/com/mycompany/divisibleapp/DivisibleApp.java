
package com.mycompany.divisibleapp;
 
import java.util.Scanner;

public class DivisibleApp {

    public static void main(String[] args) {
        
        int numero;
        
         Scanner entradaScanner = new Scanner (System.in);
         System.out.println("Introduce un número: ");
         numero = entradaScanner.nextInt();
          
          //Hacemos cálculos matemáticos
         if (numero%2==0){
             System.out.println("El número "+numero+" es divisible entre 2");  
         }else{
             System.out.println("El número "+numero+" no es divisible entre 2");
         }
          
    }
}
