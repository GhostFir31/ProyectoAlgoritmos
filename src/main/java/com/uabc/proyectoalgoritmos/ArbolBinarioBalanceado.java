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
    }
}
