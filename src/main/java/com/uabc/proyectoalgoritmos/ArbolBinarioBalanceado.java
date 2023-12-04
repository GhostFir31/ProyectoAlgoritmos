package com.uabc.proyectoalgoritmos;

import java.util.ArrayList;

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
    
    public Nodo eliminarRecursivo(Nodo raizActual, int valor) {
    if (raizActual == null) {
        return raizActual;
    }

    if (valor < raizActual.getValor()) {
        raizActual.setIzquierda(eliminarRecursivo(raizActual.getIzquierda(), valor));
    } else if (valor > raizActual.getValor()) {
        raizActual.setDerecha(eliminarRecursivo(raizActual.getDerecha(), valor));
    } else {
        // Caso 1: Nodo con un solo hijo o sin hijos
        if (raizActual.getIzquierda() == null) {
            return raizActual.getDerecha();
        } else if (raizActual.getDerecha() == null) {
            return raizActual.getIzquierda();
        }

        // Caso 2: Nodo con dos hijos
        // Encontrar el sucesor inmediato (el menor valor en el subárbol derecho)
        raizActual.setValor(encontrarMinimo(raizActual.getDerecha()).getValor());

        // Eliminar el sucesor inmediato del subárbol derecho
        raizActual.setDerecha(eliminarRecursivo(raizActual.getDerecha(), raizActual.getValor()));
    }   

        return raizActual;
    }
    
    private Nodo encontrarMinimo(Nodo nodo) {
        Nodo actual = nodo;
        while (actual.getIzquierda() != null) {
            actual = actual.getIzquierda();
        }
        return actual;
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
    
    public void recorridoPostOrden(Nodo r){
        if(r==null)
            System.out.println("Arbol vacío");
        else{
            if(r.getIzquierda()!=null)
                recorridoPostOrden(r.getIzquierda());
            
            if(r.getDerecha()!=null)
                recorridoPostOrden(r.getDerecha());
            
            System.out.println("["+r.getValor()+"]");
        }
    }
    
    public void recorridoInorden(Nodo r){
        if(r.getIzquierda()!=null)
            recorridoInorden(r.getIzquierda());
        
        System.out.println("["+r.getValor()+"]");
        
        if(r.getDerecha()!=null)
            recorridoInorden(r.getDerecha());
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public String obtenerCodigo(Nodo r,int valor){
        
        if(r==null)
            return "vacio";
        else{
            if(valor==r.getValor())
                return "";
            else{
                if(valor<r.getValor())//Si el valor dado es menor que el valor del nodo actual
                    if(r.getIzquierda()!=null)//si el hijo de la izq es dif a null
                        return "0"+obtenerCodigo(r.getIzquierda(),valor);
                    else
                        return "[No existe el número en el arbol]";
                else{
                    if(valor>r.getValor())
                        if(r.getDerecha()!=null)
                            return "1"+obtenerCodigo(r.getDerecha(),valor);
                        else
                            return "[No existe el número en el arbol]";
                    else
                        return "Es igual";
                }
            }
        }
    }
    
    public Nodo Balancea(Nodo r){
        if(r==null){
            return null;
        }
        
        //Obtener lista de nodos en orden
        ArrayList<Nodo> nodos = new ArrayList<>();
        enOrden(r,nodos);
        
        //construir un árbol balanceado en base a una lista ordenada
        return creaBalanceado(nodos,0,nodos.size()-1);
    }
    
    public void enOrden(Nodo r,ArrayList<Nodo> nodos){
        if(r==null)
            return;
        
        enOrden(r.getIzquierda(),nodos);
        nodos.add(r);
        enOrden(r.getDerecha(),nodos);
    }
    
    public Nodo creaBalanceado(ArrayList<Nodo> nodos, int inicio, int fin){
        if(inicio>fin)
            return null;
        
        int mid = (inicio+fin)/2;
        Nodo actual = nodos.get(mid);
        
        actual.setIzquierda(creaBalanceado(nodos,inicio,mid-1));
        actual.setDerecha(creaBalanceado(nodos,mid+1,fin));
        
        return actual;
    }
}
