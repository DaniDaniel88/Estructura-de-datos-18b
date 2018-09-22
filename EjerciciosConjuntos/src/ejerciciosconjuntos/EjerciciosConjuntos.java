
package ejerciciosconjuntos;
import java.io.*;
import OperacionesC.Vectores;


public class EjerciciosConjuntos {
    public static void main(String[] args) throws IOException {
       Vectores Objeto1 = new Vectores();
       
       System.out.println("Arreglo inicializado = Conjunto vacio");
       Objeto1.conjuntoVacio();
       Objeto1.LLenar();
       
       Objeto1.Interface();
       
       System.out.println("Union conjuntos"); Objeto1.UnionConjuntos();
       
       System.out.println("Interseccion entre conjuntos"); Objeto1.InterseccionArreglos();
       
       System.out.println("Diferencia conjuntos"); Objeto1.Diferencia();
       
       Objeto1.insertarElemento();
        
    }
    
}
