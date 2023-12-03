
package com.uabc.proyectoalgoritmos;
import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoAlgoritmos {
    private ArbolBinarioBalanceado arbol;
    private Metodos metodo = new Metodos();
    private Scanner entrada = new Scanner(System.in);
    private ArrayList<Integer> arreglo = new ArrayList<>();
    
    public ProyectoAlgoritmos(){
        arbol = new ArbolBinarioBalanceado();
    }

    public static void main(String[] args) {
        ProyectoAlgoritmos proyecto= new ProyectoAlgoritmos();
        boolean activo=true;
        
        while(activo == true){
            proyecto.mostrarMenu();
        }
        
    }
    
    public void mostrarMenu(){
        Scanner ent = new Scanner(System.in);
        int opcion, valor;
        
            System.out.println("1... Generar ArrayList\n2... Insertar ArrayList\n3... Inserta Numero\4... \n5...PreOrden\n6... PostOrden");
            System.out.println("Escoge opción");
            opcion = ent.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Escribe el tam del arraylist y después el valor máximo que puede alcanzar");
                    arreglo = metodo.generarNumeros(ent.nextInt(), ent.nextInt());
                    System.out.println(arreglo);
                break;
                
                case 2:
                    agregarDatosArrayList();
                break;
                
                case 3:
                    System.out.println("Escribe valor");
                    valor=entrada.nextInt();
                    agregarDato(valor);
                break;
                
                case 5:
                    preOrden();
                break;
                
                case 6:
                    postOrden();
                break;
            }
    }
    
    public void agregarDatosArrayList(){
        int n = arreglo.size();
        
        if(n!=0)
            for(int i =0;i<n;i++)
                agregarDato(arreglo.get(i));
    }
    
    public void agregarDato(int valor){
      
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
    
    public void postOrden(){
        arbol.recorridoPostOrden(arbol.getRaiz());
    }
}
