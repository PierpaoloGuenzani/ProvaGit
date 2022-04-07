package multithreading.Barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Race
{
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException
    {
        CyclicBarrier b = new CyclicBarrier(10);
        Car c[] = new Car[10];
        for(int i = 0; i < 10; i++)
        {
            c[i] = new Car(100,i,b);
            c[i].start();
        }
        System.out.println("Gara iniziata");
    }    
}
