// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        int quantidade = 0;
        
        System.out.println("Digite os números inteiros e positivos (digite um número negativo para encerrar):");
        
        do {
            numero = scanner.nextInt();
            
            if (numero >= 0) {
                soma += numero;
                quantidade++;
            }
        } while (numero >= 0);
        
        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
        
        scanner.close();
    }
}

