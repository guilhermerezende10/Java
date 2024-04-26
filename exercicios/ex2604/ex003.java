// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float precoTotal = 0;
        do {
            System.out.print("Digite o preço do "+ i +"° produto: ");
            float preco = sc.nextFloat();
            System.out.print("Digite a quantidade do "+ i +"° produto: ");
            int qtd = sc.nextInt();
            precoTotal += preco * qtd;
            i++;
        } while(i <= 4);

        System.out.println("O preço total é de R$" + precoTotal);

        sc.close();
    }
}
