
package proyecto_unidad1;
import PalabrasArchivo.OperacionesPalabras;
import java.util.Scanner;

public class Proyecto_Unidad1 {
    public static void main(String[] args) {
        
        OperacionesPalabras objeto1 = new OperacionesPalabras();
        Scanner boton = new Scanner (System.in);
        String name;
        System.out.println("Texto extraido");
        
        System.out.println(objeto1.LeerTxt("NombresX1.txt"));
        
        String palabras[] = new String [objeto1.LeerTxt("NombresX1.txt").size()];//Conversion de arrayList a un arreglo tipo String
        palabras=objeto1.LeerTxt("NombresX1.txt").toArray(palabras);
        
        objeto1.metodoRecursivo1(palabras, 0);
        
        objeto1.ImpData(palabras);
        
        System.out.println("para buscar en la lista digite el nombre");
        name=boton.nextLine();
        objeto1.Buscar(palabras, name, 0);
        
       
        
    }
    
}
