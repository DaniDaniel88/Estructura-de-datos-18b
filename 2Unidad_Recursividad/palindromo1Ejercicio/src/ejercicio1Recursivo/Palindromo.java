
package ejercicio1Recursivo;

public class Palindromo {
    
    String cadena; int CantidadLetras;
    
    //Método recursivo
    public static boolean palindromo(String cadena, int a, int palabrasTanio) {
        
        if (a!=cadena.length()/2){
            
            if (cadena.charAt(a)==cadena.charAt(palabrasTanio)){
                
                return palindromo(cadena, a+1, palabrasTanio-1);
            }else{
                return false;
            }
        }
        return true;
    }
            
}
