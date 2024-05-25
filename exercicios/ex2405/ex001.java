package ex2405;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int soma = 0;
            while(i >= 1) {
                System.out.print("Digite um número: ");
                int num = sc.nextInt();
                soma+= num;
                System.out.println("Você quer continuar? ");
                sc.nextLine();
                String sn = sc.nextLine();
                if (sn.equals("N")) {
                    i = -1;
                }
            }
            
        System.out.println("A soma foi: " + soma);
        sc.close();
    }
}
