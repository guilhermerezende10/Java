
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = sc.nextFloat();
    
        if (num % 5 == 0 ) System.out.print("Ele é divisível por 5");
        else System.out.print("Ele não é divisível por 5");
        

        sc.close();
    }
}