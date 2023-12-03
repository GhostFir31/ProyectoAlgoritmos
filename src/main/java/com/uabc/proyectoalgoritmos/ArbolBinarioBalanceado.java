package com.uabc.proyectoalgoritmos;

public class ArbolBinarioBalanceado {
    Nodo raiz;
    
    public ArbolBinarioBalanceado(){
        this.raiz=null;
    }
    
    public void insertaNodo(int valor){
        Nodo n = new Nodo(valor);
        //No hay nodos en el árbol
        if(raiz==null)
            raiz=n;
    }
}
