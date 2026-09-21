package com.example;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas idades você deseja apresentar");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];
        int soma = 0;
        double media = 0;
        
        for (int i = 0; i < tamanho; i++){
            System.out.println("Diga a idade do " + (i + 1) +"° aluno:");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        media = soma / tamanho;
        
        for(int i = 0; i < 5; i++){
            System.out.println("Idade do " + (i + 1) + "° aluno: " + numeros[i] + "\n \n");
            System.out.println("Soma das do idades: " + soma + "\n \n");
            System.out.println("Média das idades:" + numeros[i] + "\n \n");

        }
        
        scanner.close();
    }
}

