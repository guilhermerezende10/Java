package ex1705;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int menor = sc.nextInt();
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
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("O menor valor fornecido foi: " + menor);
        sc.close();
    }
}
