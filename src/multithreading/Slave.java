package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Slave implements Runnable
{

    private Es e;
    private boolean b;

    public Slave(Es e, boolean b)
    {
        this.e = e;
        this.b = b;
    }

    @Override
    public void run()
    {
        if(b)
        {
            while(true)
            {
                System.out.println(e.getI());
                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException ex)
                {
                    Logger.getLogger(Slave.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            while(true)
            {
                e.increase();
                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException ex)
                {
                    Logger.getLogger(Slave.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
