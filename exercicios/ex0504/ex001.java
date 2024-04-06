import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        String vogal = "";
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = sc.nextLine();
        String[] vogais = { "a", "e", "i", "o", "u" };
        for (int i = 0; i < vogais.length; i++) {
            if (letra.equals(vogais[i])) {
                vogal = "Vogal";
                break; 
            }
        }
        System.out.print("A letra é uma " + (vogal.equals("Vogal") ? vogal : "Consoante"));

        sc.close();
    }
}
