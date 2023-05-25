/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2Guia7;
import java.util.Scanner;
/**
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 *
 * @author Rafael
 */
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        boolean dato1;
        double dato2;
        char dato3;
        
        System.out.println("Ingrese un valor booleano: ");
        dato1 = leer.nextBoolean();
        System.out.println("Ingrese un valor double: ");
        dato2 = leer.nextDouble();
        System.out.println("Ingrese un valor de tipo char: ");
        dato3 = leer.next().charAt(0);
        
        System.out.println(dato1);
        System.out.println(dato2);
        System.out.println(dato3);
        
        
        
    }
}
