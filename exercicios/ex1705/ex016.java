package ex1705;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = 0;
        int a = 150;
        int f = 110;
        if(a>f){
        while (a>=f){
            ano++;
            a = a + 2;
            f = f + 3;
        }
        
    }
    System.out.println("Serão necessários " + ano + " anos para que Felisberto seja maior que Anacleto");
    sc.close();
    
 }
}
