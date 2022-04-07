package strutturedati;
public class Stack<E>
{
    Nodo top;
    private class Nodo
    {
        private E item;
        private Nodo successivo;
    }

    public Stack(E item)
    {
        top = new Nodo();
        top.item = item;
        top.successivo = null;
    }
    
    public void push(E item)
    {
        Nodo t = new Nodo();
        t.item = item;
        t.successivo = top;
        top = t;
    }
    
    public E pop()
    {
        Nodo t = null;
        if(top.successivo != null)
        {
            t = top;
            top = top.successivo;
        }
        else
        {
            t = top;
            top = null;
        }
        return t.item;
    }
    
    public E top()
    {
        return top.item;
    }
}
