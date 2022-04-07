/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Paolo
 */
public class Prova
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Es e = new Es();
        Thread l = new Thread(new Slave(e,true));
        l.start();
        Thread s = new Thread(new Slave(e,false));
        s.start();
    }
    
}
