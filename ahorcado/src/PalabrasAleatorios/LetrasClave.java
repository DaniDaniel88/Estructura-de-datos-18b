
package PalabrasAleatorios;

import java.util.Scanner;

public class LetrasClave {
    
    public static char[] separador(String palAzar) {//Divide en silabas cada palabra
        char[] letras;
        letras = new char[palAzar.length()];
        for (int i = 0; i < palAzar.length(); i++) {
            letras[i] = palAzar.charAt(i);
        }
        return letras;
    }
    
    
    
    public static void imprimeOculta(char[] tusRespuestas) {//Ingresa la respuesta seguida de un espacio

        for (int i = 0; i < tusRespuestas.length; i++) {
            System.out.print(tusRespuestas[i] + " ");
        }
    }
    
    
    //Bluce temporal sirve para indicar si termina el programa o continua
    public static char preguntar(String men, Scanner teclado) {
        char resp;
        System.out.println(men + " (s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') {
            System.out.println(" Valor desconocido admite solo S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
    
    
}
