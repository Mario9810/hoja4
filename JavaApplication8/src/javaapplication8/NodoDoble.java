/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author ledod
 */
public class NodoDoble<E> {
    private E valor;
    private int objetoSiguiente;
    public NodoDoble(E valor, int siguiente){
        this.valor=valor;
        objetoSiguiente=siguiente;
    }
    public E getValor(){
        return valor;
    }
}
