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
    
    /*
    public void eliminarNodo(int valor){
        Nodo aux = raiz;
        //Si el nodo es raíz
        if(valor==raiz.getValor()){
            //si tiene nodo derecho
            if(raiz.getDerecha()!=null){
                raiz=raiz.getDerecha();
                //sí hay nodo izquierdo
                if(aux.getIzquierda()!=null){
                    //Insertamos nodo izquierdo con
                    //todo lo que acarrea
                    insertaNodo(aux.getIzquierda().valor);
                }
                //Desligamos el nodo eliminado
                aux.setIzquierda(null);
                aux.setDerecha(null);
            }
            //Si solo hay un nodo izquierdo
            else if(aux.getIzquierda()!=null){
                //La raíz se vuelve el nodo izquierdo
                raiz=aux.getIzquierda();
                aux.setIzquierda(null);
                aux.setDerecha(null);
            }
            //Si no hay nodos en el árbol este se vacía
            else
                raiz=null;
        }
        else{
            Nodo preAux = raiz;
            //Avanzamos al sig Nodo
            if(valor>raiz.getValor())
                aux = aux.getDerecha();
            else
                aux = aux.getIzquierda();
            
            while(aux!=null){
                //si encontramos el valor
                if(aux.getValor()==valor)
                    //si el nodo es el hijo derecho de su padre
                    if(aux==preAux.getDerecha()){
                        //Si el nodo actual rtiene derecho
                        if(aux.getDerecha()!=null){
                            //El nodo derecho se pone en su lugar
                            preAux.setDerecha(aux.getDerecha());
                            //Si tiene izquierdo
                            //El nodo derecho se pone en su lugar
                            preAux.setDerecha(aux.getDerecha());
                            //Si tiene izquierdo
                            if(aux.getIzquierda()!=null)
                                //lo reinertamos
                                insertaNodo(aux.getIzquierda().valor);
                            aux.setIzquierda(null);
                            aux.setDerecha(null);
                            break;
                        }
                        //Si solo tiene lado izquierdo
                        else if(aux.getIzquierda()!=null){
                            //Esto quiere decir que el nodo
                            //derecho del padro ahora es
                            //nodo izquierdo del actual
                            preAux.setDerecha(aux.getIzquierda());
                            aux.setIzquierda(null);
                            aux.setDerecha(null);
                        }
                        else
                            //Si no tiene hijos el nodo actual
                            //entonces la derecha del padre apunta
                            preAux.setDerecha(null);
                    }
                    else{
                        if(preAux.getDerecha()!=null){
                           preAux.setIzquierda(aux.getDerecha());
                           if(aux.getIzquierda()!=null)
                               insertaNodo(aux.getIzquierda().getValor());
                           aux.setIzquierda(null);
                           aux.setDerecha(null);
                        }
                        else if(aux.getIzquierda()!=null){
                           preAux.setIzquierda(aux.getIzquierda());
                           aux.setIzquierda(null);
                           aux.setDerecha(null);
                        }
                        else
                            preAux.setIzquierda(null);
                    }  
            }
            preAux=aux;
        }
    }*/
    
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
