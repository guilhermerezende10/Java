// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex010{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pr = 1;
        float pf = 0;
        do {
            System.out.print("Digite o preço do primeiro produto");
            pr = sc.nextFloat();
            System.out.print("Digite a quantidade comprada desse produto");
            int qtd = sc.nextInt();
            float total = pr * qtd;
            pf += total;
        } while(pr > 0);

        System.out.print("O valor total que a empresa pagará é: " + pf);

        sc.close();
    }
}
