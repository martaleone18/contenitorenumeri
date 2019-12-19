/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez01.domenici;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class ContenitoreNumeri {

    private ArrayList<Integer> numeri = new ArrayList<>();

    public void inserisci(Integer numero) {
        if (isValid(numero)) {
            numeri.add(numero);
        }
    }

    private boolean isValid(Integer numero) {
        boolean result = true;
        for (int i = 0; i < numeri.size(); i++) {
            if (numeri.get(i) > numero) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
