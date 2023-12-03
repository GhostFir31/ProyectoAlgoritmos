package com.uabc.proyectoalgoritmos;

public class Nodo {
    int valor;
    Nodo izquierda,derecha;
    
    public Nodo(int valor){
        this.valor=valor;
        izquierda = derecha = null;
    }
    
    public Nodo getIzquierda(){
        return izquierda;
    }
    
    public Nodo getDerecha(){
        return derecha;
    }
    
    public int getValor(){
        return valor;
    }
}
