import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 3 numeros inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(calcArgumento(n1, n2, n3));
        sc.close();
    }

    static int calcArgumento(int x, int y, int z) {
        int soma = x + y + z;
        return soma;
    }
}
