
import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o valor do produto? ");
        double valor = sc.nextDouble();
        System.out.print("Qual a forma de pagamento? (1- à vista, 2- à prazo) ");
        int fp = sc.nextInt();

        switch(fp) {
            case 1:
                System.out.print("O valor final será: " + (valor * 0.9));
                break;
            case 2:
                System.out.print("O valor final será: " + valor);
                break;
        }

        sc.close();
    }
}