package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        Robot robbie = new Robot(0,0);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta;
        do{
            System.out.println("Coordenada X: ");
            int x = Integer.parseInt(br.readLine());
            System.out.println("Coordenada Y: ");
            int y = Integer.parseInt(br.readLine());

            robbie.mover(x,y);

            System.out.println("Posición actual de Robbie: ("+robbie.getX()+","+ robbie.getY()+")");

            System.out.println("¿Otra vez? (s/n)");
            respuesta = br.readLine();

        }while (!respuesta.equalsIgnoreCase("N"));

    }
}
