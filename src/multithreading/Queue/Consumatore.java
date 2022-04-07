package multithreading.Queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumatore implements Runnable
{
    BlockingQueue<Integer> obj;

    public Consumatore(BlockingQueue<Integer> obj)
    {
        this.obj = obj;
    }

    @Override
    public void run()
    {
        Random r = new Random();
        Integer i;
        for(;;)
        {
            try
            {
                i = obj.take();
                System.out.println("distruggo : "+i);
            }
            catch(InterruptedException ex)
            {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
