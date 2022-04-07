package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Timer extends Thread
{
    long inizio,passare;
    boolean flag =false;

    public Timer(int passare)
    {
        super();
        inizio = System.currentTimeMillis();
        this.passare = passare*1000;
        this.start();
    }
    
    @Override
    public void run()
    {
        while((inizio + passare) > System.currentTimeMillis())
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.operazioneDaSvolgere();
    }
    
    public void reset()
    {
        inizio = System.currentTimeMillis();
    }
    
    public void operazioneDaSvolgere()
    {
        System.out.println("Tempo scaduto");
        flag = true;
    }
    
    public static void main(String[] args)
    {
        Timer t = new Timer(5);
        while(!t.flag)
        {
            System.out.println("ciao");
        }
    }
}
