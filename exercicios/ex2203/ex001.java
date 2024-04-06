
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite outro número: ");
        float n2 = sc.nextFloat();
        float maior = n1 > n2 ? n1 : n2;
        System.out.print("O maior número é: " + maior);

        sc.close();
    }
}