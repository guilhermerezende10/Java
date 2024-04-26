// Feito com Daniel Alonso

package ex2604;

import java.util.Scanner;

public class ex004{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float horasTotal = 0;
        do {
            System.out.print("Digite a qtd de horas do "+ i +"° dia: ");
            float horas = sc.nextFloat();
            horasTotal += horas;
            i++;
        } while(i <= 30);

        System.out.println("O quantidade de horas trabalhadas foram de " + horasTotal + "h");

        sc.close();
    }
}
