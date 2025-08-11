package org.example;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + "nota");
                notas[i] = ler.nextDouble();
            }while (notas[1] <0 || notas[i] >10);
        }
        System.out.println("\nExibindo as notas");
        for (double nota : notas) {
            System.out.println("notas " + nota);
        }
        double media =(notas[0] + notas[1] + notas[2])/2;
        System.out.println("\n Média: " + media);
        ler.close();
    }
}
