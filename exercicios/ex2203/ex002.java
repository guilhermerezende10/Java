
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float n1 = sc.nextFloat();
        System.out.print("O número é " + (n1 % 2 == 0 ? "par" : "ímpar"));

        sc.close();
    }
}