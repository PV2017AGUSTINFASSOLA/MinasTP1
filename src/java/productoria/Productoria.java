/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productoria;

/**
 *
 * @author Alumno
 */
public class Productoria {
   private int n;

    public Productoria() {
    }

    public Productoria(int n) {
        this.n = n;
    }


    
    public void asignarValor(int num){
        n=num;
    }
    public int obtenerProductoria(){
        int valorProductoria = 1;
        int aux=n;
        while(n>=1){
            valorProductoria=valorProductoria*n;
            n=n-1;
            
        }
        n=aux;
        return valorProductoria;
    }
    
}
