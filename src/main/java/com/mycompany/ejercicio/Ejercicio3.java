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
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero, uno, dos;
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        numero = tc.nextInt();
        uno = numero*2;
        dos =numero*3;
        System.out.println("el doble del numero es:"+uno+"    el triple del numero es:"+ dos);
        
    }
}
