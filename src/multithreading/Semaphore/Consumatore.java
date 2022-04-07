package multithreading.Semaphore;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumatore implements Runnable
{

    Buffer b;

    public Consumatore(Buffer b)
    {
        this.b = b;
    }

    @Override
    public void run()
    {
        while(true)
        {
            synchronized(b)
            {
                while(b.puntatore <= 0)
                {
                    try
                    {
                        System.err.println("Consumatore in pausa");
                        b.wait();
                        Thread.sleep(20);
                    }
                    catch(InterruptedException ex)
                    {
                        Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("Consumatore consuma : " + b.consuma());
                b.notifyAll();
            }
        }
    }

}
