
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        int maior = 0;
        int soma = 0;
        int num = 0;
        while (i <= 10) {
            if (num >= 0) {
                System.out.print("Digite um número: ");
                num = sc.nextInt();
                if(num > maior) maior = num;
                soma+=num;
            }
            i++;
        }
        System.out.println("Maior: " + maior + "\nSoma: " + soma + "\nMedia: " + soma / 10 );

        sc.close();
    }
}