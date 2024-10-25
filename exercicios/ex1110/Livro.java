import java.util.Scanner;

public class Livro {

    private String cod;
    private String categoria;

    public Livro(String cod, String categoria) {
        this.cod = cod;
        this.categoria = categoria;
    }

    public String lerCod() {
        if (cod.equals("A")) {
            return "Ficção";
        } else if (cod.equals("B")) {
            return "Não-Ficção";
        } else {
            return "Código Inválido";
        }
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do livro: ");
        String cod = scanner.nextLine();

        Livro livro = new Livro(cod, null);

        String categoria = livro.lerCod();

        System.out.println("A categoria do livro é: " + categoria);

        scanner.close();
    }
}