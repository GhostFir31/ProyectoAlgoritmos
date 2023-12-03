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
        else{
            Nodo aux = raiz;
            while(aux!=null){
                //Si el nodo no posee hijos
                if(aux.getDerecha()==null && aux.getIzquierda()==null)
                    if(n.getValor()>aux.getValor()){
                        aux.setDerecha(n);
                        break;
                    }
                    else{
                        aux.setIzquierda(n);
                        break;
                    }  
                //El nodo no posee hijo a la derecha
                //y el valor es mayor al del nodo
                else if(n.getValor()>aux.getValor() && aux.getDerecha()==null){
                    aux.setDerecha(n);
                    break;
                }
            }
        }
    }
}
