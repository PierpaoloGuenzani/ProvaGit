package multithreading.Semaphore;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produttore implements Runnable
{

    Buffer b;

    public Produttore(Buffer b)
    {
        this.b = b;
    }

    @Override
    public void run()
    {
        Random r = new Random();
        while(true)
        {
            synchronized(b)
            {
                while(b.puntatore >= b.dimensione)
                {
                    try
                    {
                        System.err.println("Produttore in pausa");
                        b.wait();
                        Thread.sleep(20);
                    }
                    catch(InterruptedException ex)
                    {
                        Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int t = r.nextInt(100);
                System.out.println("Produttore ho prodotto : " + t);
                b.produci(t);
                b.notifyAll();
            }
        }
    }

}
