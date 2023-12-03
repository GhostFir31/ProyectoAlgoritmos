
package com.uabc.proyectoalgoritmos;
import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoAlgoritmos {
    private ArbolBinarioBalanceado arbol;
    private Scanner entrada = new Scanner(System.in);
    
    public ProyectoAlgoritmos(){
        arbol = new ArbolBinarioBalanceado();
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int opcion;
        ProyectoAlgoritmos proyecto= new ProyectoAlgoritmos();
        Metodos metodo = new Metodos();
        ArrayList<Integer> vector = metodo.generarNumeros(10, 5);
        boolean activo=true;

        /*System.out.println("Números generados:");
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }*/
        
        while(activo == true){
            System.out.println("1... Agregar\n2... Eliminar\n3... PreOrden");
            System.out.println("Escoge opción");
            opcion = ent.nextInt();
            
            switch(opcion){
                case 1:
                    proyecto.agregarDato();
                break;
                
                case 2:
                    proyecto.eliminarDato();
                break;
                
                case 3:
                    proyecto.preOrden();
                break;
            }
        }
        
    }
    
    public void agregarDato(){
        int valor;
        System.out.println("Escribe valor");
        valor=entrada.nextInt();
        
        arbol.insertaNodo(valor,arbol.getRaiz());
    }
    
    public void eliminarDato(){
        /*int valor;
        System.out.println("Escribe valor");
        valor=entrada.nextInt();
        
        arbol.eliminarNodo(valor);*/
    }
    
    public void preOrden(){
        arbol.recorridoPreOrden(arbol.getRaiz());
    }
}
