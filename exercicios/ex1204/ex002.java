
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = sc.nextFloat();
    
        if (num > 20) System.out.print(num);
        

        sc.close();
    }
}