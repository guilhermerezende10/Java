
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite um número real: ");
        float n1 = sc.nextFloat();
        float maior = n1;
        float menor = n1;
        System.out.print("maior: " + maior + "\nmenor: " + menor);
        while (n1 != 0) {
            System.out.print("\nDigite um número real: ");
            n1 = sc.nextFloat();
            if(n1 > maior) maior = n1;
            if(n1 < menor) menor = n1;
            System.out.print("maior: " + maior + "\nmenor :" + menor);
        }

        sc.close();
    }
}