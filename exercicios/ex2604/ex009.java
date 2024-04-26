// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex009{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int maior = -999999999;
        int menor = 999999999;
        do {
            System.out.print("Digite um número inteiro: ");
            int N = sc.nextInt();
            if(N > maior){
                maior = N;
            }
            if(N < menor){
                menor = N;
            }
            i++;
        } while(i <= 20);

        System.out.print("O maior valor digitado foi " + maior + " e o menor foi " + menor);

        sc.close();
    }
}
