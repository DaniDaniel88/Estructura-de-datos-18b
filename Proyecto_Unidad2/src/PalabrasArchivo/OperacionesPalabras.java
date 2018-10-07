
package PalabrasArchivo;

//import java.io.BufferedReader;//Libreria para hacer operaciones con archivos
//import java.io.FileReader;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class OperacionesPalabras {
    
    public ArrayList<String> LeerTxt(String direccion){//direccion del archivo 
        
        ArrayList<String> Palabras = new ArrayList();//arreglo dinamico para los nombres
        
        try{
            BufferedReader bf = new BufferedReader (new FileReader(direccion));
            
            String bfRead;
             
            while( (bfRead = bf.readLine()) != null){//haz el ciclo, mientras tiene datos
                Palabras.add(bfRead);//se guardarn todos los nombres del arhivo dentro del arreglo
            }
            bf.close();
            
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }
        
            return Palabras;//retorna la lista de palabras
    }
    
    public void metodoRecursivo1 (String [] nombresArreglo, int x){//metodo recursivo cruzado
        if(x<nombresArreglo.length){
                Recursivo(nombresArreglo, x, 0); metodoRecursivo1(nombresArreglo, x+1);
        } 
            
   }
    public void ImpData (String[] datos){//Imprime todos los datos ordenados alfabeticamente
        for(String m:datos){System.out.println(m);}
    }
    
  // segundo metodo recursivo  0,0, 0,1 1,2
    //Compara dos nombres para ver si es mayor, menor o igual
    public void Recursivo(String[] nombres, int i, int x){
            if (x < nombres.length && i != x){
                if(nombres[i].compareToIgnoreCase(nombres[x])<0){
                    String con = nombres[i];
                    nombres[i]=nombres[x];
                    nombres[x]=con;   
                }Recursivo(nombres, i,x+1); 
            }
                
          }
    
    //Metodo para buscar una palabra en el arreglo
    public Boolean Buscar(String []nombresArchivo, String buscar, int i){
        
        if (i >= nombresArchivo.length){System.out.println("no se encotro");return false;}
        else if (nombresArchivo[i].equals(buscar)){System.out.println("se encotro");return true;}
        return Buscar(nombresArchivo, buscar,i+1);
    }
          
    
         
}
