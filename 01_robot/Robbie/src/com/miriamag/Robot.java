package com.miriamag;

/**
 * Created by 7FPROG11 on 09/01/2017.
 */
public class Robot {

    private int x = 0;//Si los valores de lso atributos son sencillos se pueden poner en la inicialización
    private int y = 0;


    public void mover(int x, int y) {

        if (x < 10 && y < 10 && x > -10 && y > -10) {//limites

            if (x == this.x && y == this.y + 1) {
                this.y = y;
            }

            if (x == this.y && y == this.y + 1) {
                this.y = y;
            }

            if (x == this.x - 1 && y == this.y) {
                this.x = x;
            }

            if (x == this.x + 1 && y == this.y) {
                this.x = x;
            }

        }
    }

    public Robot() {//constructor vacío, debería llevar los valores de los atributos si son complejas
        /*x = 0;
        y = 0;*/
    }

    public Robot(int x, int y){//constructor con todos los atributos, SIEMPRE
        this.x = x;
        this.y = y;
    }

    /*Métodos de acceso. En los getters boolean se pone isX o isY. A veces no tiene sentido generar todos.
    En este caso desde el exterior no deberían mover la x ni la y por lo que los set, en este caso no deberían implementarlos*/

    /*public void setX(int x){
        this.x = x;
    }*/

    public int getX(){
        return x;
    }

   /* public void setY(int y) {
        this.y = y;
    }*/

    public int getY() {
        return y;
    }


}
