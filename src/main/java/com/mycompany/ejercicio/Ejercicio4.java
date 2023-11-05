/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        double c, f;
        Scanner tc= new Scanner(System.in);
        System.out.println("ingresa un nuermo C");
        c = tc.nextDouble();
        f= (32+(9*(c/5)));
        System.out.println("el valor de las grados farenheit es:"+f);
    }
}
