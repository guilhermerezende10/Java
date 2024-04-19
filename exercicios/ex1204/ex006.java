
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite novamente um número: ");
        double n2 = sc.nextDouble();
        System.out.print("Qual operação você deseja realizar? ");
        int operacao = sc.nextInt();

        switch(operacao) {
            case 1:
                System.out.print("A média entre os números é: " + (n1 + n2) / 2 );
                break;
            case 2:
                System.out.print("A diferença entre os números é de: " + (n1 - n2));
                break;
            case 3:
                System.out.print("O produto entre os número é: " + (n1 * n2));
                break;
            case 4:
                System.out.print("O primeiro número dividido pelo segundo é: " + (n1 / n2));
                break;
        }

        sc.close();
    }
}