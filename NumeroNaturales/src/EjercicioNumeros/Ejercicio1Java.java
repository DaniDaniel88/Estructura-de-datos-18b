
package EjercicioNumeros;
import java.util.Scanner;


public class Ejercicio1Java {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int w;
        int elige;
        System.out.println("Opciones Validos");
        do{
           System.out.println("(1) Cero ");
           System.out.println("(2) Sucesor");
           System.out.println("(3) El numero es cero");
           System.out.println("(4) El Numero son Iguales");
           System.out.println("(5) Suma de los Numeros");
           System.out.println("(6) Antecesor");
           System.out.println("(7) Diferencia");
           System.out.println("(8) Menor");
           System.out.println(" Elige una de las operaciones");
           elige = teclado.nextInt();
           System.out.println("Ingre un numero natural valido ");
            w=teclado.nextInt();
           NumeroNaturales ob1=new NumeroNaturales(w);
           if(elige == 1){
                System.out.println(ob1.Cero());
                    
           } else if(elige==2){
               System.out.println("El numero sucesor de " +w+ " es: " + ob1.Sucesor());
           }else if (elige==3){
               System.out.println(ob1.Escero());
           }else if (elige==4){
               int a;
               System.out.println("Ingrese un nuevo numero");
               a=teclado.nextInt();
               System.out.println("El numero " + w + ob1.Igual(a) + "  a "+ a );
           }else if (elige==5){
               int b;
               System.out.println("Ingrese un numero ");
               b=teclado.nextInt();
               System.out.println("La suma de los numeros es "+ ob1.Suma(b));
           }else if (elige==6){
                System.out.println("El numero antecesor de "+w+" es: " + ob1.Antecesor());
           }else if (elige==7){
               int c;
               System.out.println("Ingrese un nuevo numero");
               c=teclado.nextInt();
               System.out.println("La diferencia de " + w + " Es: " + ob1.Diferencia(c));
           }else if (elige==8){
               int d;
               System.out.println("Ingrese un nuevo numero");
               d=teclado.nextInt();
               System.out.println("El numero  : " + w + ob1.Menor(d)+ " a " + d);
           }
        }while(elige!=8);
    }
    }
    

