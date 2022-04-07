package multithreading.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main
{
    public static void main(String[] args)
    {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(100);
        Thread p = new Thread(new Produttore(bq));
        p.start();
        Thread c = new Thread(new Consumatore(bq));
        c.start();
        
    }
}
