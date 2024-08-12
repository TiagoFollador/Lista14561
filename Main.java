package com.mycompany.array;

/**
 *
 * @author tiago
 */
public class Main {
    public static void main(String[] args){
        Fila fila =  new Fila(5);

        fila.imprime();

        fila.insere(1);
        fila.imprime();

        fila.insere(2);
        fila.insere(3);
        fila.insere(4);
        fila.insere(5);
        fila.insere(6);
        fila.imprime();
        fila.remove();
        fila.imprime();

        fila.insere(7);
        fila.insere(8);
        fila.insere(9);
        fila.remove();
        fila.imprime();

    }
}
