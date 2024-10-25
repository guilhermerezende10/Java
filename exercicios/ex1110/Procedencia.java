import java.util.Scanner;

public class Procedencia {
    private double preco;
    private int codigo;


    public Procedencia(double preco, int codigo) {
        this.preco = preco;
        this.codigo = codigo;
    }

    public String calculoProcedencia() {
        String procedencia;
        switch (codigo) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Sudeste";
                break;
            case 3:
                procedencia = "Centro-Oeste";    
                break;
            case 4:
                procedencia = "Norte";
                break;
            case 5:
                procedencia = "Nordeste";
                break;
            
            default:
                procedencia = "Código Inválido";
                break;
        }

        return procedencia;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Informe o código de origem do produto: ");
        int codigo = scanner.nextInt();

        Procedencia procedencia = new Procedencia(preco, codigo);

        String resultado = procedencia.calculoProcedencia();

        System.out.println("Preço: "+ preco + "R$, Procedência: " + resultado);

        scanner.close();
    }
}
