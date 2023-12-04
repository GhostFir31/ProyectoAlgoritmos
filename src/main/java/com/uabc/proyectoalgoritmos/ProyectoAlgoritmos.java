
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
        
        /*InterfazMenu ide =new InterfazMenu();
        ide.setVisible(true);
        ide.setLocationRelativeTo(null); */
        
        
        ProyectoAlgoritmos proyecto= new ProyectoAlgoritmos();
        boolean activo=true;
        
        while(activo == true){
            proyecto.mostrarMenu();
        }
        
    }
    
    public void mostrarMenu(){
        Scanner ent = new Scanner(System.in);
        int opcion, valor;
        StringBuilder codigoInvertido;
        
            System.out.println("1... Generar ArrayList\n2... Insertar ArrayList\n3... Inserta Numero\n4... Eliminar Dato \n5...PreOrden\n6... PostOrden\n7... Inorden\n10... Código");
            System.out.println("Escoge opción");
            opcion = ent.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Escribe el valor máximo que puede alcanzar y después el tam del arraylist");
                    arreglo = metodo.generarNumeros(ent.nextInt(), ent.nextInt());
                    System.out.println(arreglo);
                break;
                
                case 2:
                    agregarDatosArrayList();
                    arbol.setRaiz(arbol.Balancea(arbol.getRaiz()));
                break;
                
                case 3:
                    System.out.println("Escribe valor");
                    valor=entrada.nextInt();
                    agregarDato(valor);
                    arbol.setRaiz(arbol.Balancea(arbol.getRaiz()));
                break;
                
                case 4:
                    System.out.println("Escribe el valor a eliminar: ");
                    valor=entrada.nextInt();
                    arbol.eliminarRecursivo(arbol.getRaiz(),valor);
                    arbol.setRaiz(arbol.Balancea(arbol.getRaiz()));
                break;
                
                case 5:
                    preOrden();
                break;
                
                case 6:
                    postOrden();
                break;
                
                case 7:
                    inOrden();
                break;
                
                case 10:
                    System.out.println("Escribe el valor a codigicar: ");
                    valor=entrada.nextInt();
                    codigoInvertido = new StringBuilder(arbol.obtenerCodigo(arbol.getRaiz(), valor));
                    System.out.println("Codigo: "+codigoInvertido);
                    codigoInvertido.reverse();
                    System.out.println("Codigo Invertido: "+codigoInvertido);
                break;
            }
    }
        
    public void agregarDatosArrayList(){
        int n = arreglo.size();
        
        if(n!=0)
            for(int i =0;i<n;i++)
                agregarDato(arreglo.get(i));
        
        //BalanceaArbol();
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
        String text = "";
        
        text = arbol.recorridoPreOrden(arbol.getRaiz());
        System.out.println(text);
    }
    
    public void postOrden(){
        String text = "";
        
        text = arbol.recorridoPostOrden(arbol.getRaiz());
        System.out.println(text);
    }
    
    public void inOrden(){
        String text = "";
        
        text = arbol.recorridoInorden(arbol.getRaiz());
        System.out.println(text);
    }
    
    public void BalanceaArbol(){
        arbol.Balancea(arbol.getRaiz());
    }
}
