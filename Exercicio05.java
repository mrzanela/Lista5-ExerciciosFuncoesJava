import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer valor: ");
        double valor = sc.nextDouble();
        System.out.println("Agora a porcentagem do imposto em valor decimal");
        double porcentagem = sc.nextDouble();
        System.out.println(calculaImposto(valor, porcentagem));
        sc.close();
    }

    static double calculaImposto(double x, double y) {
        x = x * y + x;
        return x;
    }
}
