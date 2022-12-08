import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        calculaResultado(n);
        sc.close();
    }

    static void calculaResultado(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}
