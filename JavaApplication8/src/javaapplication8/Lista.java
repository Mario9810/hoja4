/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author ledod
 */
public abstract class Lista<E> implements Stack{
    protected int count;
    
   
   public boolean empty(){
        return (size()==0);
    }
   
   public int size(){
       return count;
   }
    
}
