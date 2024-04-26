// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex006{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int soma = 0;
        System.out.print("Digite o valor de N");
        int N = sc.nextInt();
        do {
            soma += i;
            i++;
        } while(i <= N);

        System.out.print("O valor de H é: " + soma);

        sc.close();
    }
}
