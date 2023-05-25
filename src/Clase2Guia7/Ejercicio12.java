/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package Clase2Guia7;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n1, n2;
        System.out.println("Ingrese primer numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        n2 = leer.nextInt();
        System.out.println("");
        
        esMultiplo(n1, n2);
        System.out.println("");
        
    }
   public static void esMultiplo (int n1, int n2){
       
       if(n1 % n2 == 0){
           System.out.println("El primer numero ingresado es multiplo del segundo.");
       }else{
           System.out.println("El primer numero ingresado NO es multiplo del segundo.");
           System.out.println("");
       }
       
       
   } 
}

