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
        Metodos metodo = new Metodos();
        ArrayList<Integer> vector = metodo.generarNumeros(10, 5);

        System.out.println("Números generados:");
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }
    }
}
