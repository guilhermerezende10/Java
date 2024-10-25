import java.util.Scanner;

public class Cilindro {

    private double raio;
    private double altura;


    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }


    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor do raio do cilindro: ");
        double raio = scanner.nextDouble();


        System.out.print("Informe o valor da altura do cilindro: ");
        double altura = scanner.nextDouble();


        Cilindro cilindro = new Cilindro(raio, altura);


        double volume = cilindro.calcularVolume();


        System.out.printf("O volume do cilindro é: " + volume);


        scanner.close();
    }
}