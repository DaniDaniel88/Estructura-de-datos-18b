package ejercicio3Compras;

import java.util.Scanner;

public class CalculadoraDevoluciones {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calcula billetes y monedas de una compra");
        
        System.out.println("Digite el total de la compra: ");
        
        double compra = sc.nextDouble();
        
        System.out.println("Digite el monto depositado: ");
        
        double monto = sc.nextDouble();
        
        System.out.println("Cambio en monedas de: \n");
        
        methods llmadaMetodo = new methods(monto, compra);
    }
}
