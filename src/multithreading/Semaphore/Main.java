package multithreading.Semaphore;
public class Main
{
    public static void main(String[] args)
    {
        Buffer b = new Buffer(10);
        Thread p = new Thread(new Produttore(b));
        p.start();
        Thread p2 = new Thread(new Produttore(b));
        p2.start();
        Thread c = new Thread(new Consumatore(b));
        c.start();
        
    }
    
}
