/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2Guia7;
import java.util.Scanner;
/**
 * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 *
 * @author Rafael
 */
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int n2 = leer.nextInt();
        
        if(n1 > 25 && n2 > 25){
            System.out.println("Ambos numeros son mayor a 25.");
        }else if(n1 > 25 || n2 > 25){
            System.out.println("Alguno de los dos numeros es mayor a 25.");
        }else{
            System.out.println("Ninguno de los numeros es mayor a 25.");
        }
        
        
    }
    
}
