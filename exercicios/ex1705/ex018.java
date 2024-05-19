package ex1705;

import java.util.Scanner;


public class ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();
        String tabuada = "";
        for(int i = 1; i <= 10; i++) {
            tabuada += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        System.out.println("Tabuada de "+ numero + "\n" + tabuada);
        sc.close();
    }
}
