package multithreading.Semaphore;
public class Buffer
{
    private int b[];
    int dimensione;
    int puntatore = 0;

    public Buffer(int dimensione)
    {
        this.dimensione = dimensione;
        b = new int[dimensione];
    }
    
    public void produci(int a)
    {
        b[puntatore++] = a;
    }
    
    public int consuma()
    {
        return b[--puntatore];
    }  
}
