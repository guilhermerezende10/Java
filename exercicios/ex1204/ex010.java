
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é a altura do degrau? ");
        double escada = sc.nextDouble();
        System.out.print("Qual é a altura que você quer subir? ");
        double altura = sc.nextDouble();

        System.out.print("Serão necessários " + altura / escada + " degraus");

        sc.close();
    }
}