/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.proyectoalgoritmos;
import java.util.ArrayList;
/**
 *
 * @author JesusOmar Leal
 */
public class ProyectoAlgoritmos {
    public static void main(String[] args) {
        ArbolBinarioBalanceado arbolBinario = new ArbolBinarioBalanceado();
        
        // Insertar 10 nodos en el árbol
        for(int i = 0; i < 2; i++){
            arbolBinario.insertaNodo(i);
        }
        
        // Realizar recorrido preorden e imprimir los valores
        System.out.println("Recorrido Preorden: ");
        arbolBinario.recorridoPreOrden(arbolBinario.raiz);
    }
}