/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.array;

/**
 *
 * @author tiago
 */
public class Fila {
    private int primeiro;
    private int ultimo;
    private int dados[];
    private int capacidade;
    private int tamanho;

    public Fila(
       int capacidade
    ){
        this.primeiro = -1;
        this.ultimo = -1;
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.tamanho = -1;
    }
    
    
    public String Cheia(){
        return (this.tamanho == this.capacidade - 1)? "Fila esta cheia" : "Fila nao esta cheia";
    }
    
    public boolean isCheia(){
        return this.tamanho == this.capacidade - 1;
    }
    
    public String Vazia(){
        return (this.tamanho == 0 || this.tamanho == -1)? "Fila esta vazia" : "Fila nao esta vazia";
    }
    
    public boolean isVazia(){
        return this.tamanho == 0 || this.tamanho == -1;
    }
    
    public void insere(int elemento){
        if(!isCheia()){
            System.out.println("Inserindo: " + elemento + " na lista");
            if(this.primeiro == -1 && this.ultimo == -1){
                
                this.primeiro++;
                this.ultimo++;
                this.dados[this.ultimo] = elemento;
            }
            else{
                this.ultimo++;
                this.dados[this.ultimo] = elemento;
            }
            System.out.println("Inserido");
            this.tamanho++;
        }
        else{
            System.out.println("Inserindo: " + elemento + " na lista");
            this.dados[primeiro] = elemento;
            if (this.primeiro == this.capacidade - 1){
                this.primeiro = 0;
            }
            if(this.ultimo == this.capacidade - 1){
                this.ultimo = 0;
                this.primeiro++;

            }
            else{
                this.ultimo++;
                this.primeiro++;

            }

            System.out.println("Inserido");
        }
    }
    
    public void remove(){
        if(!isVazia()){
            System.out.println("Removendo: " + this.dados[this.primeiro] + " da lista");
            this.dados[this.primeiro] = 0;
            if(this.primeiro == this.capacidade - 1){
                this.primeiro = 0;
            }
            else{
                this.primeiro++;
            }
            System.out.println("Removido com sucesso");
            this.tamanho--;
        }
    }
    
    public void imprime(){
        int counter = 0;
        int posicao = this.primeiro;
        if(!isVazia()) {
            do {
                System.out.println("Posicao: " + posicao + "\nDado: " + this.dados[posicao] + "\n");
                posicao++;
                counter++;
                if (posicao >= this.capacidade) {
                    posicao = 0;
                }

            } while (counter < capacidade);
        }
        else{
            System.out.println(Vazia());
        }
    }

}