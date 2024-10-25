import java.util.Scanner;

public class Salario {
    private double salarioAtual;


    public Salario(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }


    public double calcularSalario() {
        double result;
        if (salarioAtual < 500) {
            result = salarioAtual * 1.15;
        } else if(salarioAtual < 1000){
            result = salarioAtual * 1.1;
        } else {
            result = salarioAtual * 1.05;
        }
        return result;
    }


    public double getsalarioAtual() {
        return salarioAtual;
    }

    public void setsalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o seu salario atual: ");
        double salarioAtual = scanner.nextDouble();


        Salario salario = new Salario(salarioAtual);


        double salarioFinal = salario.calcularSalario();


        System.out.printf("Salário com reajuste é de: " + salarioFinal);


        scanner.close();
    }
}
