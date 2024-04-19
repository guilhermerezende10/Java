
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é a primeira nota? ");
        double n1 = sc.nextDouble();
        System.out.print("Qual é a segunda nota? ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        if(media < 4.1) {
            System.out.print("Reprovado");
        } else if(media < 7.1) {
            System.out.print("Exame");
        } else {
            System.out.print("Aprovado");
        }

        sc.close();
    }
}