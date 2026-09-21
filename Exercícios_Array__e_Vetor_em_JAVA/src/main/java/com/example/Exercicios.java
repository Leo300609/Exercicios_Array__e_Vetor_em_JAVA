package com.example;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++){
            System.out.println("Diga a idade do " + (i + 1) +"° aluno:");
            numeros[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("Idade do " + (i + 1) + "° aluno: " + numeros[i]);
        }
        
        scanner.close();
    }
}