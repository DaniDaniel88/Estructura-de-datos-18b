
package conversionNumeros;

public class Conversion {
    int Base10; long Base2;
    
    public long binario(int n){
        if (n<2){
            return n;
        }else{
            return (n%2)+(binario(n/2))*10;
        }
    }
}
