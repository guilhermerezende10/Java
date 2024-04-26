// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float pesoTotal = 0;
        do {
            System.out.print("Digite o peso da "+ i +"° caixa: ");
            float peso = sc.nextFloat();
            pesoTotal += peso;
            i++;
        } while(i <= 25);

        System.out.println("O peso total é de " + pesoTotal);

        sc.close();
    }
}
