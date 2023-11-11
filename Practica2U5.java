/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2u5;

import java.util.Scanner;

/**
 *
 * @author Uriel
 */
public class Practica2U5 {

   public static double sumar(double n1, double n2) {
        return n1 + n2;
    }

    
    public static double restar(double n1, double n2) {
        return n1-n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    
    public static double dividir(double n1, double n2) {
       
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
       
          Scanner numeros= new Scanner (System.in);
    
         System.out.println("Ingresar num1 ");
         double numero1=numeros.nextDouble();
         System.out.println("Ingresar num 2");
         double numero2=numeros.nextDouble();
         
        double resultadoSuma = sumar(numero1,numero2);
        double resultadoResta = restar(numero1,numero2);
        double resultadoMultiplicacion = multiplicar(numero1,numero2);
        double resultadoDivision = dividir(numero1,numero2);

        
        System.out.println("Suma=  " + resultadoSuma);
        System.out.println("Resta= " + resultadoResta);
        System.out.println("Multiplicacion=  " + resultadoMultiplicacion);
        System.out.println("Division=  " + resultadoDivision);
    }
}

