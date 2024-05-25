package ex2405;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int soma = 0;
        int contador = 0;
        int homensTrintao = 0;
        int mulheresMenoresDeIdade = 0;
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        System.out.println("Qual é seu nome? ");
        String nome = sc.nextLine();

        System.out.println("Qual é a sua idade? ");
        int idade = sc.nextInt();

        System.out.println("Qual é seu sexo (M e F)? ");
        sc.nextLine();
        String sexo = sc.nextLine();

        soma += idade;
        contador++;

        String nomeMaisVelho = nome;
        int idadeMaisVelho = idade;

        if (sexo.equals("F")) {
            nomeMaisNova = nome;
            idadeMaisNova = idade;
        }

        if (sexo.equals("M") && idade > 30) homensTrintao++;
        if (sexo.equals("F") && idade < 18) mulheresMenoresDeIdade++;

        while (i >= 1) {
            System.out.println("Você quer continuar? ");
            String sn = sc.nextLine();
            if (sn.equals("N")) {
                i = -1;
            } else {
                System.out.println("Qual é seu nome? ");
                nome = sc.nextLine();
                System.out.println("Qual é a sua idade? ");
                idade = sc.nextInt();
                System.out.println("Qual é seu sexo (M e F)? ");
                sc.nextLine();
                sexo = sc.nextLine();

                soma += idade;
                contador++;

                if (idade > idadeMaisVelho) {
                    nomeMaisVelho = nome;
                    idadeMaisVelho = idade;
                }

                if (sexo.equals("F")) {
                    if (idade < idadeMaisNova) {
                        idadeMaisNova = idade;
                        nomeMaisNova = nome;
                    }
                }

                if (sexo.equals("M") && idade > 30) homensTrintao++;
                if (sexo.equals("F") && idade < 18) mulheresMenoresDeIdade++;
            }
        }
        
        System.out.println("O nome da pessoa com maior idade lida foi: " + nomeMaisVelho);
        System.out.println("O nome da mulher mais jovem foi: " + nomeMaisNova);
        System.out.println("A média de idade do grupo foi: " + (double) soma / contador);
        System.out.println("A quantidade de homens com mais de 30 anos foi: " + homensTrintao);
        System.out.println("A quantidade de mulheres com menos de 18 anos foi: " + mulheresMenoresDeIdade);
        
        sc.close();
    }
}
