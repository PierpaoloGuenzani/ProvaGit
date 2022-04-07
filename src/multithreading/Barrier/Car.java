package multithreading.Barrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread
{
    int distanza, percorso, blocco;
    CyclicBarrier b;
    
    public Car()
    {}

    public Car(int distanza, int blocco, CyclicBarrier b)
    {
        super();
        this.distanza = distanza;
        this.blocco = blocco;
        this.b = b;
    }

    
    
    @Override
    public void run()
    {
        Random r = new Random();
        try
        {
            b.await();
        }
        catch(InterruptedException | BrokenBarrierException e)
        {
            System.err.println("Errore ");
        }
        System.out.println("tempo partenza :"+System.currentTimeMillis() +"e sono il numero :"+this.blocco);
        while(distanza > percorso)
        {
            percorso = percorso + r.nextInt(distanza/10);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {}
        }
        System.out.println("Sono arrivato e sono il numero :"+this.blocco);
    }
}
