package com.example;


import java.util.Scanner;

import com.example.ejercicios.FizzBuzz;
import com.example.ejercicios.NumerosPrimos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.game();

        /*Scanner scanner = new Scanner(System.in);
        int numero = NumerosPrimos.leerNumero(scanner);
        boolean esPrimo = NumerosPrimos.numeroPrimo(numero);
        NumerosPrimos.enviarMensaje(esPrimo);*/

    }
}