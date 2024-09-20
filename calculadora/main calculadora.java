package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero1, numero2, resultado = 0.0;
        char operacion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        numero2 = scanner.nextDouble();

        System.out.println("Ingrese la operación a realizar (+, -, *, /, %):");
        operacion = scanner.next().charAt(0);

        if (operacion == '+') {
            resultado = numero1 + numero2;
        } else if (operacion == '-') {
            resultado = numero1 - numero2;
        } else if (operacion == '*') {
            resultado = numero1 * numero2;
        } else if (operacion == '/') {

            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Error: División por cero no funciona.");
                return;
            }
        } else if (operacion == '%') {

            if (numero2 != 0) {
                resultado = numero1 % numero2;
            } else {
                System.out.println("Error: División por cero no funciona.");
                return;
            }
        } else {
            System.out.println("Operación no validada.");
            return;
        }

        System.out.println("El resultado de la operación es: " + resultado);

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor que el primero.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        if (resultado % 2 == 0) {
            System.out.println("El resultado es par.");
        } else {
            System.out.println("El resultado es impar.");
        }

        int resultadoEntero = (int) resultado;
        System.out.println("El resultado convertido a entero es: " + resultadoEntero);

        if (numero1 > 0 && numero2 > 0 && numero1 > 10 && numero2 > 10) {
            System.out.println("Ambos números son positivos y mayores que 10.");
        }

        if (numero1 < 0 || numero2 < 0 || numero1 == 0 || numero2 == 0) {
            System.out.println("Al menos uno de los números es negativo o igual a cero.");
        }

        scanner.close();
    }
}