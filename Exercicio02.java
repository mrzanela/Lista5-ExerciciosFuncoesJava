import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        sc.close();
        CalculaResultado(n);
    }

    static void CalculaResultado(int nm) {
        int i = 0, j = 0;
        while (i < (nm + 1)) {
            while (j < i) {
                System.out.print((j + 1) + " ");
                j = j + 1;
            }
            System.out.println();
            j = 0;
            i = i + 1;
        }
    }
}
