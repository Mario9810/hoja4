/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ledod
 */
public class ListaCircular<E> extends Lista{
    private NodoSimple<E> head;
    private ArrayList<NodoSimple<E>> lista;
    public ListaCircular(){
        head=null;
        count=0;
        lista=new ArrayList<NodoSimple<E>>();
    }
    
    public void push(E item){
        lista.add(new NodoSimple(item,count));
        count++;
    }
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop(){
       
       return lista.remove(lista.size()-1).getValor();
   }
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek(){
       return lista.get(size()-1).getValor();
   }
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   // post: returns true if and only if the stack is empty
   

    
}
