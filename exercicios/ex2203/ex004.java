
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        System.out.print("O triangulo é: " + (lado1 == lado2 && lado2 == lado3 ? "Equilátero" : lado1 != lado2 && lado2 != lado3 ? "Escaleno" : "Isóceles"));

        sc.close();
    }
}