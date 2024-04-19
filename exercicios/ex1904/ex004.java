
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        int i = 0;
        while (i <= 10) {
            
            System.out.print("\n" + n1 +" x "+ i +" = " + n1 * i);
            i++;
        }

        sc.close();
    }
}