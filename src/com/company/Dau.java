package com.company;

import java.util.Random;

public class Dau {
    int numeroDau;
    public int tirarDau(){
        //Genera un numero aleatorio entre el 1 y el 6.
        Random ran = new Random();
        numeroDau = ran.nextInt(7 - 1) + 1;

        //Devolver el dado seleccionado
        return numeroDau;
    }

}
