package com.livecron;

import com.livecron.modelo.EstaturaDelPerro;
import com.livecron.modelo.Perro;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Iniciando mi clase de Java");

        // nombre de la clase / nombre de la variable = new /nombre de la clase ();\
        Perro cuki = new Perro("Cuki", 2,  240.0f);
        cuki.setMacho(false);
        cuki.setTamanio(EstaturaDelPerro.PEQUENIO);
        cuki.setInicial('C');

        System.out.println(cuki.toString());

        Perro tobi = new Perro("Tobi");
        tobi.setEdad(1);
        tobi.setMacho(true);
        tobi.setTamanio(EstaturaDelPerro.MEDIANO);
        tobi.setInicial('T');
        tobi.setPrecio(50.50f);

        System.out.println(tobi.toString());
    }
}
