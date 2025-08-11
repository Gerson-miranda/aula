package org.example;
import java.util.Scanner;
public class exercicio_2 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite seu nome :");
            String nome = ler.nextLine();

            System.out.println("Digite a primeira nota :");
            double nota1 = ler.nextDouble();

            System.out.println("Digite a segunda nota :");
            double nota2 = ler.nextDouble();

            double media=(nota1 + nota2)/2;

            String resultado;
            if (media >= 7){
                resultado = "Aprovado";
            } else if (media >= 5 && media < 6.9) {
                resultado = "Verificação Suplementar";
            } else {
                resultado = "Reprovado";
            }
            System.out.println("\n= Apresentado dados =");
            System.out.println("Nome:" + nome);
            System.out.println("Primeira nota: " + nota1 );
            System.out.println("Seguanda nota: " + nota2 );
            System.out.println("Media:" + media );
            System.out.println("Resultado:"+ resultado );
            ler.close();
        }
    }