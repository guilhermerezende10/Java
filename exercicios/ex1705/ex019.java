package ex1705;

import java.util.Scanner;


public class ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int media = 0;
        int qtd = 0;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int idade = 1;
  

        while(idade > 0) {
            System.out.print("Digite a sua idade: ");
            idade = sc.nextInt();
            if(idade < 0) break;
            media += idade;
            System.out.print("Digite a sua opinião sobre o filme (A, B, C, D, E): ");
            sc.nextLine();
            String opn = sc.nextLine();
            switch (opn) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
                case "D":
                    d++;
                    break;
                case "E":
                    e++;
                    break;
            
                default: 
                System.out.print("Entrada inválida");
                    break;
            }
    
            qtd++;
        }
        
        System.out.println(qtd +" pessoas responderam a pesquisa.");
        System.out.println(media / qtd +" anos é a média de idade dos participantes.");
        System.out.println("A = "+ 100 / qtd * a + "%");
        System.out.println("B = "+ 100 / qtd * b + "%");
        System.out.println("C = "+ 100 / qtd * c + "%");
        System.out.println("D = "+ 100 / qtd * d + "%");
        System.out.println("E = "+ 100 / qtd * e + "%");
        sc.close();
    }
}
