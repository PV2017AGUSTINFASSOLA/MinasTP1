/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Productoria.Productoria;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class ProductoriaFormBean {
private int n;
    /**
     * Creates a new instance of ProductoriaFormBean
     */
    public ProductoriaFormBean() {
    }
    public int calcularProductoria(){
    Productoria unaProductoria=new Productoria();
    unaProductoria.asignarValor(n);
    return unaProductoria.obtenerProductoria();}
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
}
