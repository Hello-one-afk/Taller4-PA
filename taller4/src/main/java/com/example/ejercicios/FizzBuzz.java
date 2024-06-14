package com.example.ejercicios;

import java.util.Scanner;

public class FizzBuzz {
    Scanner teclado = new Scanner(System.in);

    private int numeroUsuario;

    public void game() {
        usuarioSeleccionarNumero();
        System.out.println(condicionesFizzBuzz());
    }

    public void usuarioSeleccionarNumero() {
        do {
            System.out.println("Ingrese Numero del 1-100");
            numeroUsuario = teclado.nextInt();
        } while (numeroUsuario < 0 || numeroUsuario > 100);
    }



    public String condicionesFizzBuzz() {
        if (numeroUsuario%3==0 && numeroUsuario%5 == 0) {
            return "FizzBuzz";
        }else if (numeroUsuario%3==0) {
            return "Fizz";        
        }else if (numeroUsuario%5 == 0) {
            return "Buzz";
        }
        return "No se encontro un valor";
        
    }

}
