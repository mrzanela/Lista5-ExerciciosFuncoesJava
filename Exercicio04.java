import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero inteiro");
        int num = sc.nextInt();
        letra(num);
        sc.close();
    }

    static void letra(int z) {
        if (z >= 0) {
            System.out.println("P");
        } else {
            System.out.println("N");
        }
    }
}
