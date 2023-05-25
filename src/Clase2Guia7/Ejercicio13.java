/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package Clase2Guia7;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         String [] equipo = new String[7];
         
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el valor en la posicion: " + i);
            equipo [i] = leer.nextLine();
        }  
        System.out.println("");
        
        for (String equipo1 : equipo) {
            System.out.println("los nombres del equipo son: " + equipo1);
        }
        
    }
    
}
