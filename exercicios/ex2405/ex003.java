package ex2405;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int soma = 0;
        int idade = 0;

        while(idade != 999) {
            System.out.println("Qual é a sua idade? ");
            idade = sc.nextInt();
            if(idade != 999) {
                soma += idade;
                contador++;
            }   
        }
            
        System.out.println("A media total de idades foi: " + soma / contador);
        System.out.println("A quantidade de alunos é de: " + contador);
        sc.close();
    }
}
