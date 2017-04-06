/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sumatoria.Sumatoria;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class SumatoriaFormBean {
private int n;
    /**
     * Creates a new instance of SumatoriaFormBean
     */
    public SumatoriaFormBean() {
    }
    public int calcularSumatoria(){
    Sumatoria unaSumatoria=new Sumatoria();
    unaSumatoria.asignarValor(n);
    return unaSumatoria.obtenerSumatoria();
    }
    
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
