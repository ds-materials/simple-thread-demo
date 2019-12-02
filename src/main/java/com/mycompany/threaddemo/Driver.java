/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threaddemo;

/**
 *
 * @author squishy
 */
public class Driver {
    public static void main(String [] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread2.start();
        thread1.start();
    }
}
