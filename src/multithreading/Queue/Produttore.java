package multithreading.Queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produttore implements Runnable
{
    BlockingQueue<Integer> obj;

    public Produttore(BlockingQueue<Integer> obj)
    {
        this.obj = obj;
    }

    @Override
    public void run()
    {
        Random r = new Random();
        for(int i=0;;i++)
        {
            try
            {
                obj.put(i);
                System.out.println("creo : "+i);
            }
            catch(InterruptedException ex)
            {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
