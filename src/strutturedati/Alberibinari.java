package strutturedati;

import java.util.LinkedList;
import java.util.List;

public class Alberibinari<E>
{

    public Nodo radice;

    private class Nodo
    {
        private E dato;
        private Nodo sx, dx, precedente;

        public Nodo(E dato) {
            this.dato = dato;
        }

        public void visita()
        {
            System.out.println(dato.toString());
        }

        public void preorder()
        {
            this.visita();
            if(sx != null)
            {
                sx.preorder();
            }
            if(dx != null)
            {
                dx.preorder();
            }
        }

        public void inorder()
        {
            if(sx != null)
            {
                sx.inorder();
            }
            this.visita();
            if(dx != null)
            {
                dx.inorder();
            }
        }

        public void postorder()
        {
            if(sx != null)
            {
                sx.postorder();
            }
            if(dx != null)
            {
                dx.postorder();
            }
            this.visita();
        }

    }

    public void preorder()
    {
        radice.preorder();
    }

    public void inorder()
    {
        radice.inorder();
    }

    public void postorder()
    {
        radice.postorder();
    }


    public Alberibinari(E primo)
    {
        radice = new Nodo(primo);
        radice.precedente = null;
    }

    public void add(E dato)
    {
        if(radice.sx == null)
            radice.sx = new Nodo(dato);
        else if(radice.dx == null)
            radice.dx = new Nodo(dato);
    }

}
