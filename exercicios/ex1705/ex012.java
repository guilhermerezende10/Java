package ex1705;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int maior = sc.nextInt();
        int num = maior;
        while(num > 0) {
            System.out.print("Digite um número: ");
             num = sc.nextInt();
             if(num > maior) maior = num;
        }
        System.out.println("O maior valor fornecido foi: " + maior);
        sc.close();
    }
}
