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
public class Ejercicio5 {
    public static void main(String[] args) {
        double c, l, a;
        Scanner tc = new Scanner(System.in);
        System.out.println("ingresa un radio");
       c = tc.nextDouble();
       l = (2*3.1416*c);
       a = (3.1416 *(c*c));
        System.out.println("el valor de la longitud es :"+l);
        System.out.println("el valor del area es:  "+a);
    }
}
