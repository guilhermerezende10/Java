package ex2405;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int homensCont = 0;
        int mediaHomem = 0;
        int mulherJovem = 9999999;

        System.out.println("Qual é a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Qual é seu sexo (M e F)? ");
        sc.nextLine();
        String sexo = sc.nextLine();
        int maior = idade;
        if(sexo.equals("F")) {
            mulherJovem = idade;
        }
        else if(sexo.equals("M")) {
            homensCont++;
            mediaHomem+=idade;
        } 
         
        while(i >= 1) {
            System.out.println("Você quer continuar? ");
            String sn = sc.nextLine();
            if (sn.equals("N")) {
                i = -1;
            }

            else {
                System.out.println("Qual é a sua idade? ");
            idade = sc.nextInt();
            System.out.println("Qual é seu sexo (M e F)? ");
            sc.nextLine();
            sexo = sc.nextLine();
           
            if(idade > maior) maior = idade;

            if(sexo.equals("F")) {
                if(idade < mulherJovem) mulherJovem = idade;
            }
            else if(sexo.equals("M")) {
                homensCont++;
                mediaHomem+=idade;
            } 
            }
          
        }
            
        System.out.println("A maior idade lida foi: " + maior);
        System.out.println("A quantidade de homens cadastrados foi: " + homensCont);
        System.out.println("A idade da mulher mais jovem foi: " + mulherJovem);
        System.out.println("A media de idade dos homens foi: " + mediaHomem / homensCont);
        sc.close();
    }
}
