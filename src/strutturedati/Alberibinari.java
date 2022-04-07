package strutturedati;

public class Alberibinari<E>
{

    public Nodo radice;

    private class Nodo
    {

        private E dato;
        private Nodo sx, dx, precedente;

        public Nodo(E dato)
        {
            this.dato = dato;
        }

        public E visita()
        {
            return dato;
        }
        
        public void preorder(Callable c)
        {
            c.call();
            if(sx != null)
            {
                sx.postorder(c);
            }
            if(dx != null)
            {
                dx.postorder(c);
            }
        }
        
        public void inorder(Callable c)
        {
            if(sx != null)
            {
                sx.postorder(c);
            }
            c.call();
            if(dx != null)
            {
                dx.postorder(c);
            }
        }
                
        public void postorder(Callable c)
        {
            if(sx != null)
            {
                sx.postorder(c);
            }
            if(dx != null)
            {
                dx.postorder(c);
            }
            c.call();
        }
        
    }

    public Alberibinari(E primo)
    {
        radice = new Nodo(primo);
        radice.precedente = null;
    }

    public void add(E dato)
    {
        /*if(radice.sx == null)
            radice.sx = new Nodo(dato);
         */

    }

}
