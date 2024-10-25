import java.util.Scanner;

public class Cone {

    private double raio;
    private double altura;


    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }


    public double calcularVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
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


        System.out.print("Informe o valor do raio do cone: ");
        double raio = scanner.nextDouble();


        System.out.print("Informe o valor da altura do cone: ");
        double altura = scanner.nextDouble();


        Cone cone = new Cone(raio, altura);


        double volume = cone.calcularVolume();


        System.out.print("O volume do cone é: " + volume);


        scanner.close();
    }
}