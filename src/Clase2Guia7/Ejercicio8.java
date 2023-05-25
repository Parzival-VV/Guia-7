/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package Clase2Guia7;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio8 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int nota = -1;
        
        while(nota < 0 || nota > 10){
        System.out.println("Ingrese una nota entre 0 y 10: ");
        nota = leer.nextInt();
        }
        
    }
    
}
