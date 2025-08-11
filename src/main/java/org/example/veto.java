package org.example;

import java.util.Scanner;

public class veto {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a " + (i + 1) + "nota");
            notas[i] = ler.nextDouble();
        }
        System.out.println("\nExibindo as notas");
        for (double nota : notas) {
            System.out.println("notas " + nota);
        }
        ler.close();
    }
}

