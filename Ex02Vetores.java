package CanvasD11;

import java.util.Scanner;

public class Ex02Vetores {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        int soma = 0;
        float media;
        int x;

        Scanner leia = new Scanner(System.in);

        for (x = 0; x < 10; x++) {
            System.out.print("Digite o número " + (x + 1) + ": ");
            vetor[x] = leia.nextInt();
            soma += vetor[x];
        }

        System.out.println("\nElementos nos índices ímpares:");
        for (x = 1; x < 10; x += 2) {
            System.out.print(vetor[x] + " ");
        }

        
        System.out.println("\nElementos pares:");
        for (x = 0; x < 10; x++) {
            if (vetor[x] % 2 == 0) {
                System.out.print(vetor[x] + " ");
            }
        }

        
        System.out.println("\nSoma: " + soma);

        media = soma / 10;
        System.out.println("Média:" + media);

    }
}

