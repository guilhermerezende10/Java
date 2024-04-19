
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = sc.nextFloat();
    
        if (num % 3 == 0 & num % 7 == 0) System.out.print("Ele é divisível por 3 e 7");
        else System.out.print("Ele não é divisível por 3 e 7");
        

        sc.close();
    }
}