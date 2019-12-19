/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez01.domenici;

import it.tss.tsslibrary.Contatore;

/**
 *
 * @author tss
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //  Contatore cont = new Contatore(0, 2);
        // while (cont.getValore() <= 200) {
        //   System.out.println(cont.getValore());
        // cont.incrementa();
        //}
        ContenitoreNumeri container = new ContenitoreNumeri();
        container.inserisci(10);
        container.inserisci(11);
        container.inserisci(20);
        System.out.println(container);

    }

}
