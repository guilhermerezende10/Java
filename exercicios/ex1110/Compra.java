import java.util.Scanner;

public class Compra {
    private double caixa;
    private double qtd;
    private double preco;


    public Compra(double caixa, double qtd, double preco) {
        this.caixa = caixa;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String calculo() {
        String result;
        if (qtd * preco > caixa * 0.8) {
            double precoTotal = (qtd * preco) * 1.1;
            result = "a prazo (3x), com juros de 10%, total: " + precoTotal;
        } else {
            double precoTotal = (qtd * preco) * 0.95;
            result = "à vista, com desconto de 5%, total: " + precoTotal;
        }

        return result;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em caixa: ");
        double caixa = scanner.nextDouble();

        System.out.print("Informe a quantidade de produtos: ");
        double qtd = scanner.nextDouble();

        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();

        Compra compra = new Compra(caixa, qtd, preco);

        String resultado = compra.calculo();

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
