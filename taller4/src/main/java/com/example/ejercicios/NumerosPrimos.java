package com.example.ejercicios;

import java.util.Scanner;

public class NumerosPrimos {

    public static int leerNumero(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        return scanner.nextInt();
    }

    public static boolean numeroPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void enviarMensaje(boolean esPrimo) {
        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }

    

    /*
    public static void numeroPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }
    }
     */
}
