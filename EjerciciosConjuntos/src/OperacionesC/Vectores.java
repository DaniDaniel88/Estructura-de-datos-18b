
package OperacionesC;


import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Vectores {
    
    private int aumento=0;
    private int[] x = new int[10];
    private int[] a = new int[3];
    private int[] b = new int[3];
    

    public void conjuntoVacio() {
        this.a[0] = 0; this.b[0] = 0;
    }

    public void LLenar() {
        this.a[0]=2;
        this.a[1]=3;
        this.a[2]=4;
        this.b[0]=5;
        this.b[1]=6;
        this.b[2]=4;
    }

    public void Interface() throws IOException {
        System.out.println("Conjunto 1 | Variables ");
        for (int i = 0; i < 3; i++) {
            System.out.println(this.a[i]);
        }
        System.out.println("Conjunto 2 | Variables ");
        for (int o = 0; o < 3; o++) {
            System.out.println(this.b[o]);
        }
    }
    
    public void UnionConjuntos() {//agregar un nuevo elemento xd
        //int[] x = new int[3];
        
        for (int i = 0; i < 3; i++) {
            this.x[i] = this.b[i];
        }
        for (int h = 0; h < 3; h++) {
            for (int i = 0; i < 3; i++) {
                if (this.a[h] == this.x[i]) {
                    this.x[i] = 11;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(this.a[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (this.x[i] != 11) {
                System.out.println(this.x[i]);
            }
        }
    }//union
    
    
    
    

    public void InterseccionArreglos() {
        for (int h = 0; h < 3; h++) {
            for (int i = 0; i < 3; i++) {
                if (this.a[h] == this.b[i]) {
                    System.out.println(this.b[i]);
                }
            }
        }
    }

    public void Diferencia() {
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            y[i] = this.a[i];
        }
        for (int h = 0; h < 3; h++) {
            for (int i = 0; i < 3; i++) {
                if (y[h] == this.b[i]) {
                    y[h] = 11;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (y[i] != 11) {
                System.out.println(y[i]);
            }
        }
    }
    
    public void insertarElemento(){
        Scanner boton1 = new Scanner(System.in);
        int NuevoElemento;
        System.out.println("Cree un nuevo elemento dentro del arreglo");
        NuevoElemento=boton1.nextInt();
        
                this.x[5]=NuevoElemento;
                
                System.out.println("Nuevo arreglo : ");
                 for (int i = 0; i < 3; i++) {
                     System.out.println(this.a[i]);
                 }
                 for (int i = 0; i < 3; i++) {
                     if (this.x[i] != 11) {
                System.out.println(this.x[i]);
                     }
                 }
                 System.out.println(this.x[5]);
    }
    
    
}
