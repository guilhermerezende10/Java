// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex007{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int resultado = 1;
        System.out.print("Digite o número que você deseja saber o resultado");
        int N = sc.nextInt();
        do {
            resultado = resultado * i;
            i++;
        } while(i <= N);

        System.out.print("O fatorial desse número é: " + resultado);

        sc.close();
    }
}
