package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //crear un array de 10 para ir guardando los cronos diferentes

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cronos[] c = new Cronos[10];

        char respuesta;
        int numCronos = 0;

        do {
            System.out.print("Elige una opción: \n" +
                    "\n" +
                    "1 Nuevo cronómetro\n" +
                    "2 Consultar cronómetro\n" +
                    "3 Salir" +
                    "\n");

            respuesta = br.readLine().toLowerCase().charAt(0);
            
            Cronos c1 = new Cronos();

            c1.tiempoTranscurrido();

            switch (respuesta) {
                case 'a':

                    c[numCronos] = new Cronos();
                    numCronos += 1;

                    break;
                case 'b':
                    System.out.println("nº de Crono :");
                    int n = Integer.parseInt(br.readLine());

                    c[n].tiempoTranscurrido();
                    break;

                default:
                    System.out.println("Chaus");

            }
        } while (respuesta !='c');

    }
}
