package com.uabc.proyectoalgoritmos;
import java.util.LinkedList;
import java.util.Queue;

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
    
    public void recorridoPorNiveles(Nodo raiz) {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo nodoActual = cola.poll();
            System.out.print(nodoActual.getValor() + " ");

            if (nodoActual.getIzquierda() != null) {
                cola.add(nodoActual.getIzquierda());
            }

            if (nodoActual.getDerecha() != null) {
                cola.add(nodoActual.getDerecha());
            }
        }
        System.out.println();  // Agregar una nueva línea al final
    }
}
