

package ejercicio1Recursivo;

import java.util.Scanner;

public class MainPalindromo {
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        
        Palindromo palindromo1 = new Palindromo();
        
        System.out.println("Digite una palabra o frase Para Saber si es  palíndromo : ");
        System.out.println("Todo Miniscula o Mayuscula");
        String texto=Teclado.nextLine();
        
        texto=texto.replaceAll(" ", "");
        
        palindromo1.cadena=texto;
        
        palindromo1.CantidadLetras=texto.length()-1;
        
        if (Palindromo.palindromo(palindromo1.cadena, 0, palindromo1.CantidadLetras)){
            
            System.out.println("Si es un palíndromo la palabra o frase");
        } else{
            System.out.println("No es un palíndromo la palanta o frase");
        }
    }
    
}
