
import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a data (ddmmaa): ");
        int num = sc.nextInt();

        int dia = num / 10000;

        int mes = (num - (dia * 10000)) / 100;

        int ano = num - (dia * 10000) - (mes * 100);
        
        System.out.print("O dia é " + dia + ", o mês é " + mes + " e o ano é " + ano);

        sc.close();
    }
}