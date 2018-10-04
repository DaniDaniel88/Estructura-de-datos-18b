package ejercicio3Compras;

public final class methods {
    
    private double pagoCliente = 0;
    private double totalCompra = 0;
    double cantidadDeMonedas = 0;
    double cambio=pagoCliente - totalCompra;
    
    
    public methods(double pagoClient, double totalComp) {
        this.pagoCliente = pagoClient;
        this.totalCompra = totalComp;
        method0(pagoCliente - totalCompra);
    }

    //Metodo recursivo
    public void method0(double cambio) {
        
        
        
        if (cambio >= 200) {
            
        cantidadDeMonedas = (int)(cambio / 200); 
        System.out.println(cantidadDeMonedas + " monedas de $" + 200);
        double cambioActualizado=cambio - 200 * cantidadDeMonedas;
            
            method0( cambioActualizado);
            
        }else if (cambio >= 100) {
            
        cantidadDeMonedas = (int)(cambio / 100); 
        System.out.println(cantidadDeMonedas + " monedas de $" + 100);
        double cambioActualizado=cambio - 100 * cantidadDeMonedas;
            
            method0( cambioActualizado);
            
        }else if (cambio >= 50) {
            
        cantidadDeMonedas = (int)(cambio / 50); 
        System.out.println(cantidadDeMonedas + " monedas de $" + 50);
        double cambioActualizado=cambio - 50 * cantidadDeMonedas;
            
            method0( cambioActualizado);
            
        }else if (cambio >= 20) {
            
        cantidadDeMonedas = (int)(cambio / 20); 
        System.out.println(cantidadDeMonedas + " monedas de $" + 20);
        double cambioActualizado=cambio - 20 * cantidadDeMonedas;
            
            method0( cambioActualizado);
            
        } else {
            if (cambio >= 10) {
                
                cantidadDeMonedas = (int)(cambio / 10); 
                System.out.println(cantidadDeMonedas + " monedas de $" + 10);
                double cambioActualizado=cambio - 10 * cantidadDeMonedas;
            
            method0( cambioActualizado);
            
            } else {
                if (cambio >= 2) {
                    cantidadDeMonedas = (int)(cambio / 2); 
                      System.out.println(cantidadDeMonedas + " monedas de $" + 2);
                       double cambioActualizado=cambio - 2 * cantidadDeMonedas;
                        method0( cambioActualizado);
                } else {
                    if (cambio >= 1) {
                        cantidadDeMonedas = (int)(cambio / 1); 
                        System.out.println(cantidadDeMonedas + " monedas de $" + 1);
                        double cambioActualizado=cambio - 1 * cantidadDeMonedas;
                        method0( cambioActualizado);
                        
                    }
                }
            }
        }
    }
    
}
