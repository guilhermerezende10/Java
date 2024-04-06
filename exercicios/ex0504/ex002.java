import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        String classificacao;

        switch(codigo) {
            case 1: classificacao = "Alimento não perecível";
            break;
            case 2, 3, 4: classificacao = "Alimento perecível";
            break;
            case 5, 6: classificacao = "Vestuário";
            break;
            case 7: classificacao = "Higiene Pessoal";
            break;
            case 8, 9, 10, 11, 12, 13, 14, 15: classificacao = "Limpeza e Utensílios domésticos";
            break;
            default: classificacao = "Código inválido";
            break;
        }

        System.out.print("A classificação do produto é: " + classificacao);
        

        sc.close();
    }
}
 
