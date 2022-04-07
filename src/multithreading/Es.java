/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

public class Es
{
    int i = 0;

    public synchronized int getI()
    {
        return i;
    }

    public synchronized void increase()
    {
        i++;
    }
    
    
}
