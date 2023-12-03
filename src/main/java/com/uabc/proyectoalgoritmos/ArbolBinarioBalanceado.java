package com.uabc.proyectoalgoritmos;

public class ArbolBinarioBalanceado {
    Nodo raiz;
    
    public ArbolBinarioBalanceado(){
        this.raiz=null;
    }
    
    public void insertaNodo(int valor,Nodo actual){
        Nodo agregado;
        
        if(actual==null)
            raiz=new Nodo(valor);
        else{
            if(valor<actual.getValor()){
                if(actual.getIzquierda()!=null)
                    insertaNodo(valor,actual.getIzquierda());
                else{
                    actual.setIzquierda(new Nodo(valor));
                }
            }
            else if(valor>actual.getValor()){
                if(actual.getDerecha()!=null)
                    insertaNodo(valor,actual.getDerecha());
                else{
                    actual.setDerecha(new Nodo(valor));
                }
            }                
        }      
    }
    
    public void recorridoPreOrden(Nodo r){
        Nodo actual=r,padre;
        if(actual==null)
            System.out.println("Arbol vacío");
        else{
            if(actual.getIzquierda()!=null){
                System.out.println("["+actual.getValor()+"]");
                recorridoPreOrden(actual.getIzquierda());
            }
            else
                System.out.println("["+actual.getValor()+"]");

            if(actual.getDerecha()!=null){
                recorridoPreOrden(actual.getDerecha());
            }
        }         
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
}
