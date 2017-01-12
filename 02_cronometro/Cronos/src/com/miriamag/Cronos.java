package com.miriamag;

/**
 * Created by 7FPROG11 on 12/01/2017.
 */
public class Cronos {

    private long horaInicio;

    public Cronos() {
        horaInicio = System.nanoTime();
    }

    public void tiempoTranscurrido() {

        double estimatedTime = (System.nanoTime() - horaInicio)/1000000000.0;

        System.out.println(estimatedTime);
    }

}
