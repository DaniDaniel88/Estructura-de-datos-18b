
package ahorcado;
import PalabrasAleatorios.LetrasClave;
import java.util.Scanner;
import java.util.Random;

public class Ahorcado {
    public static void main(String[] args) {
        
        
        LetrasClave m = new LetrasClave();
        int intentos = 0;
        int aciertos = 0;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char resp;
        // elige una palabra aleatoriamente
        Random rnd = new Random();
        // CREAMOS UNAS PALABRAS Y LE ASIGNAMOSUNA ALEATORIA A UNA VARIABLE
        String PalabraUsuario;
        
        System.out.println("Antes de empezar agregue un nombre de un sistema operativo");
        System.out.println("windows o linux");
        PalabraUsuario=teclado.nextLine();
       
        String arrayPalabras[] = {"ubunto", "solaris", "mac", "google", "firefox", "unix",PalabraUsuario};

        do {
            // Comprueba la respuesta ingresada y la guarda si es correcta 
            int aleatorio = rnd.nextInt(arrayPalabras.length);
            
            String palabra = arrayPalabras[aleatorio];
            //numero de intentos
            int intentoTotal = palabra.length() + 3;
            char[] caracteresPalabra = m.separador(palabra);
            char[] copia = m.separador(palabra); 

           
            char[] tusRespuestas = new char[caracteresPalabra.length];

            // agrega los guiones de las palabras existentes de la palabra
            for (int i = 0; i < tusRespuestas.length; i++) {
                tusRespuestas[i] = '_';
            }

            
            System.out.println("...::::Juego del ahocardo:::::... ");

            // verifica la respuesta
            while (intentos < intentoTotal && aciertos != tusRespuestas.length) {
                m.imprimeOculta(tusRespuestas);

                
                System.out.println("\nTiene un numero limitado de vidas: ");
                System.out.println("Digite la palabra");
                resp = teclado.next().toLowerCase().charAt(0);

                for (int i = 0; i < caracteresPalabra.length; i++) {
                    if (caracteresPalabra[i] == resp) {
                        tusRespuestas[i] = caracteresPalabra[i];
                        caracteresPalabra[i] = ' ';
                        aciertos++;
                    }
                }
                intentos++;
            }
            // mensaje indica si gano 
            if (aciertos == tusRespuestas.length) {
                System.out.print("\nYou Win: ");
                m.imprimeOculta(tusRespuestas);
            } 
            else {
                System.out.print("\n numero de vidas agotadas: ");
                for (int i = 0; i < copia.length; i++) {
                    System.out.print(copia[i] + " ");
                }
            }
            // reinicia los valores de las variables de numero de intentos
            intentos = 0; aciertos = 0;
            // indica al usuario si quiere seguir
            resp = m.preguntar("\n\n Desea intentar de nuevo s/n", teclado);
        } while (resp != 'n');
        
        
    }
    
}
