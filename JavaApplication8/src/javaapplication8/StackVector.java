package tarea.algoritmos.pkg2;
import java.util.Vector;
public class StackVector<E> implements Stack<E>{
    protected Vector<E> data;
public StackVector(){
        data = new Vector<E>();
    }
    public void push(E item){
        data.addElement(item);
    }
    
    public E pop()
            // pre: stack is not empty
            // post: most recently pushed item is removed and returned
    {
        return (E)data.remove(size()-1);
    }
    
    public E peek()
            // pre: stack is not empty
            // post: top value (next to be popped) is returned
    {
        return (E)data.get(size() - 1);
    }
    
    public int size()
            // post: returns the number of elements in the stack
    {
        return data.size();
    }
    
    public boolean empty()
            // post: returns true if and only if the stack is empty
    {
        return size() == 0;
    }
}
