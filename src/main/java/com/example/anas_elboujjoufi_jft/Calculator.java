package com.example.anas_elboujjoufi_jft;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int[] tafelVan(int invoer) {
        if (invoer < 1) {
            throw new ArithmeticException("Invoer moet groter zijn dan of gelijk zijn aan 1.");
        }

        int[] resultaat = new int[10];
        for (int i = 0; i < 10; i++) {
            resultaat[i] = invoer * (i + 1);
        }

        return resultaat;
    }
}

