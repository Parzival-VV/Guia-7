/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

Para realizar este ejemplo, deberás investigar el método concat de la
clase String. Puedes encontrar estos ejemplos al final de la guía.
 */
package Clase2Guia7;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        do{
            System.out.println("Ingrese una frase a codificar con un punto al final: "); //Le pedimos por teclado que ingrese una frase.
                frase = leer.nextLine();
        }while(frase.charAt(frase.length()-1) != '.');
        System.out.println("");
        System.out.println("Su frase codificada es: " + fraseCodificada(frase));//llamamos a la funcion nuevaFrase, nos devuelve por pantalla la frase codificada.
        System.out.println("");
        //con bucle do while validamos que se ingrese el punto al final y que se ejecute la linea de codigo por lo menos una vez.
        
    }
    
    public static String fraseCodificada (String frase){ //declar la funcion fraseCodificada.
        
        String nuevaFrase = ""; 
        
        for (int i = 0; i < frase.length(); i++) { //recorro el (parametro) String frase con bucle for 
        //desde i =0 hasta el largo de la frase.
           char caracter = frase.charAt(i);//declaro variable de tipo caracter y la igualo con el metodo charAT()
           //a la instancia correspondiente a i.
           String codificado ="";
            
            switch(caracter){// bucle switch evaluo la variable caracter que va a cambiar por cada vuelta del bucle for
                case 'A':
                case 'a':
                   codificado = "@"; //en el caso de que caracter sea 'A' o sea 'a' la riable codificado va a valer el simbolo entre comillas en este casp @.
                   break;
                case 'E':
                case 'e':
                    codificado = "#";
                    break;
                case 'I':
                case 'i':
                    codificado = "$";
                    break;
                case 'O':
                case 'o':
                    codificado = "%";
                    break;
                case 'U':
                case 'u':
                    codificado = "*";
                    break;
                default:
                    codificado = Character.toString(caracter);
                break;  /*si no se cumple ninguno de los casos la variable codificado la igualo a la variable caracter convirtiendola 
                en un String con el metodo "Character.toString(variable)"*/
                   
            }
            nuevaFrase = nuevaFrase.concat(codificado);/*y antes de salir del bucle for por cada vuelta voy concatenando cada caracter convertido en String
            a la variable nuevaFrase*/
        }
        return nuevaFrase; //La funcion nos decuelve la variable nuevaFRase.
       
        
    }
    
}
