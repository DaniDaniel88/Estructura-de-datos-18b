
package EjercicioNumeros;

public class NumeroNaturales {
    int n;
    NumeroNaturales(int NumeroX){
    this.n=NumeroX;
    }
    public int Cero(){
        n=0;
    return n;
    }
    public int Sucesor()
    {
        n++;
        return n;
    }
    public int Antecesor(){
        n--;
        return n;
    }
   public String Escero()
   {
       String r;
       if (n==0)
           r=" Respuesta = Es cero";
       else 
           r=" Respuesta = No es cero";
       return r;
   }
   public String Igual(int c)
   {
       String r;
       if (n==c)
           r=" Respuesta = igual ";
       else
           r=" Respuesta = No es igual ";
       return r;
   }
   public int Suma(int c){
       int r;
       r=n+c;
       return r;
   }
   public String Menor(int c){
       String r;
       if (n<c){
           r=" Respuesta = Es menor ";
       }
       else 
           r=" Respuesta = Es mayor ";
       return r;
   }
   public int Diferencia(int c){
       int r;
       r=n-c;
       return r;
   }
}

