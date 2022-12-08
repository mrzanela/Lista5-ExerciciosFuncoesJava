import java.util.Scanner;

public class Exercicio08 {
    // Faça uma função que informe a quantidade de dígitos 
    // de um determinado número inteiro informado.

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println("Seu número tem "+s.length()+" digitos");
        sc.close();
        
    }
}
