/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.proyectoalgoritmos;

import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author alan1
 */
public class Metodos {
    private ArrayList<Integer> vector = new ArrayList<>();
    private Random random = new Random();
    
    public ArrayList generarNumeros(int k, int n){
        for (int i = 0;i < n; i++){
            vector.add(random.nextInt(k)+1);
        }
        return vector;
    }
}
