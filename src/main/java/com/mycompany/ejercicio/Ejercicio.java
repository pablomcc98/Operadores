/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner tc =new Scanner(System.in);
        int num1=0, num2 =0;
        System.out.println("ingresa el primer numero");
        num1 = tc.nextInt();
        System.out.println("ingresa el segundo numero");
        num2 = tc.nextInt();
        System.out.println("los numeros ingresados son:----"+num1+ "---------"+num2);
    }
}
