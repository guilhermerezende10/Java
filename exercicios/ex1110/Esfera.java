import java.util.Scanner;

public class Esfera {

    private double raio;


    public Esfera(double raio) {
        this.raio = raio;
    }


    public double calcularVolume() {
        return 4/3 * Math.PI * (raio * raio * raio);
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor do raio da Esfera: ");
        double raio = scanner.nextDouble();


        Esfera esfera = new Esfera(raio);


        double volume = esfera.calcularVolume();


        System.out.printf("O volume da Esfera é: " + volume);


        scanner.close();
    }
}