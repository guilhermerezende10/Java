
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu salario: ");
        float salario = sc.nextFloat();
        
        System.out.print("O salario com imposto é de: " + (salario <= 1000 ? salario : salario <= 2200 ? salario * 0.87 : salario * 0.78));

        sc.close();
    }
}