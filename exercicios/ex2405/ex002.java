package ex2405;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int masculino = 0;
        int feminino = 0;
         
        while(i >= 1) {
            System.out.println("Qual é seu salario? ");
            int salario = sc.nextInt();
            System.out.println("Qual é seu sexo (M e F)? ");
            sc.nextLine();
            String sexo = sc.nextLine();
            if(sexo.equals("M")) masculino+=salario;
            else if(sexo.equals("F")) feminino+=salario;
            
            System.out.println("Você quer continuar? ");
            String sn = sc.nextLine();
            if (sn.equals("N")) {
                i = -1;
            }
        }
            
        System.out.println("O salario total dos homens foi: " + masculino);
        System.out.println("O salario total das mulheres foi: " + feminino);
        sc.close();
    }
}
