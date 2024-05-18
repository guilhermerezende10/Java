package ex1705;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = 0;
        System.out.println("Entre com um numero: ");
        num = sc.nextFloat();
   
            if(num % 2 == 0){
                System.out.println("O numero digitado é par");            
            } else{
                System.out.println("O numero digitado é impar");
                num = sc.nextFloat();
            }
        sc.close();
    }
 }
