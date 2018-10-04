

package conversionNumeros;

import java.util.Scanner;

public class MainConversion {
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        Conversion cambioBase = new Conversion();
        
        System.out.println("Digite un número de base 10 = "); cambioBase.Base10=Teclado.nextInt();
        
        cambioBase.Base2=cambioBase.binario(cambioBase.Base10);
        
        System.out.println("Numero binario es = "+cambioBase.Base2);
    }
    
}
