/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Clase2Guia7;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero entero: ");
            n1 = leer.nextInt();
            System.out.println("");
            System.out.print(n1);

            for (int j = 0; j < n1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
       
    }
    
}
