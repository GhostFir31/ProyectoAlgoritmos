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
                //El nodo no posee hijos izquierda
                //Y el valor es menor al del nodo
                else if(n.getValor()<aux.getValor() && aux.getIzquierda()==null){
                    aux.setIzquierda(n);
                    break;
                }
                //Pasamos al siguiente nodo
                else{
                    if(n.getValor()>aux.getValor())
                        aux.getDerecha();
                    else
                        aux.getIzquierda();
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
