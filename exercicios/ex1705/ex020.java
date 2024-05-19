package ex1705;

import java.util.Scanner;


public class ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while(continuar) {
            
            System.out.print("Digite quantas horas foram trabalhadas: ");
            int horas = sc.nextInt();
            System.out.print("Digite o valor da hora: ");
            float horaValor = sc.nextFloat();
            double bruto = horas * horaValor;
            double comINSS = bruto * 0.89;
            double liquido = 0;

            if(comINSS > 900 && comINSS <= 1800) {
                liquido = comINSS * 0.85;
            }
    
            else if(comINSS > 1800) {
                liquido = comINSS * 0.725;
            }
            System.out.println("O salário líquido é de: " + liquido);

            System.out.println("Você deseja continuar? (S ou N)");
            sc.nextLine();  
            String resposta = sc.nextLine();
            if(resposta.equals("N")) continuar = false;
        }
       
        sc.close();
    }
}

