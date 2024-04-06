
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu IMC: ");
        float imc = sc.nextFloat();
        

        System.out.print("Você está " + (imc < 18.5 ? "abaixo do peso" : imc < 25 ? "com peso normal" : "acima do peso"));

        sc.close();
    }
}