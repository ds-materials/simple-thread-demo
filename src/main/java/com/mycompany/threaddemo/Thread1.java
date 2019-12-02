/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threaddemo;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author squishy
 */
public class Thread1 implements Runnable {

    @Override
    public void run() {
        Random r = new Random();
        for (int i=0; i<10; i++)
        {
            System.out.println("I am in thread 1!");
            // magic code to delay and simulate doing some work
            // don't worry about it too much :)
            try {
                TimeUnit.MILLISECONDS.sleep(r.nextInt(i+1)+1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
