package ex1705;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float lar = 0;
        float com = 0;
        float area = 0;
        float total = 0;

        while (i >= 0) {
            System.out.println("Qual a largura do comodo?: ");
            lar = sc.nextInt();
            System.out.println("Qual o comprimento do comodo?: ");
            com = sc.nextInt();
            area = lar * com;
            total += area;
            System.out.println("Você quer continuar? ");
            sc.nextLine();
            String sn = sc.nextLine();
            if (sn.equals("N")) {
                i = -1;
            }

        }
        System.out.println("A área total da casa é " + total);
        sc.close();
    }
}

