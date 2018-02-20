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
public class FactoryStacks {
    
    public static Stack GetStack(int tipoStack,int claseLista){
        if (tipoStack==1)
            return new StackArrayList();
        else if (tipoStack==2)
            return new StackVector();
        else{
            if (claseLista==1)
                return new ListaSimple();
            else if (claseLista==2)
                return new ListaDoble();
            else
                return new ListaCircular();
        }
    }
}
