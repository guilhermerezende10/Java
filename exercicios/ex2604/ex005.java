// Feito com Daniel Alonso

package ex2604;

public class ex005{
    public static void main(String[] args) {
        int i = 1;
        do {
            double celsius = (i - 32) / 1.8;
            System.out.println(i +"-) " + celsius);
            i++;
        } while(i <= 30);
    }
}
