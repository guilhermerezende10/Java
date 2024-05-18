package ex1705;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int menor = sc.nextInt();
        int maior = menor;
        int num = menor;
        int i = 1;

        while (i > 0) {
            System.out.println("Você deseja continuar? (S ou N)");
            sc.nextLine();  
            String continuar = sc.nextLine();
            if (continuar.equals("N")) {
                i = -1;
            } else {
                System.out.print("Digite um número: ");
                num = sc.nextInt();
                if(num < menor) menor = num;
                if(num > maior) maior = num;
            }
        }

        System.out.println("O menor valor fornecido foi: " + menor);
        System.out.println("O maior valor fornecido foi: " + maior);
        sc.close();
    }
 }
