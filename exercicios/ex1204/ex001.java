
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu peso na terra? ");
        double peso = sc.nextFloat();
        System.out.print("Digite o número do planeta: ");
        int num = sc.nextInt();

        double gravidade = 0;

        switch(num) {
            case 1: gravidade = 0.37;
            break;
            case 2: gravidade = 0.88;
            break;
            case 3: gravidade = 0.38;
            break;
            case 4: gravidade = 2.64;
            break;
            case 5: gravidade = 1.15;
            break;
            case 6: gravidade = 1.17;
            break;

        }
        
        double pesoPlaneta = peso * gravidade;

        System.out.print("O seu peso no planeta escolhido é de: " + pesoPlaneta);

        sc.close();
    }
}