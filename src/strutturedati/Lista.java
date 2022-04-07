package strutturedati;
public class Lista<E>
{
    Nodo iniziale, finale;
    private class Nodo
    {
        private E item;
        private Nodo successivo;
    }

    public Lista(E item)
    {
        iniziale = new Nodo();
        iniziale.item = item;
        finale = iniziale;
    }
    
    public void queue(E item)
    {
        finale.successivo = new Nodo();
        finale.successivo.item = item;
        finale = finale.successivo;
    }
    
    public E dequeue()
    {
        E item = iniziale.item;
        iniziale = iniziale.successivo;
        return item;
    }
    
    public E top()
    {
        return iniziale.item;
    }
    
    public E bottom()
    {
        return finale.item;
    }
}
