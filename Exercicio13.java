import java.util.Scanner;

public class Exercicio13 {

    // 13.Desenha moldura. Construa uma função que desenhe um retângulo usando
    // os caracteres ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois parâmetros,
    // linhas e colunas, sendo que o valor por omissão é o valor mínimo igual a
    // 1 e o valor máximo é 20. Se valores fora da faixa forem informados, eles
    // devem ser modificados para valores dentro da faixa de forma elegante

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da linha entre 1 e 20: ");
        int linha = sc.nextInt();

        if (linha < 1) {
            linha = 1;
        } else if (linha > 20) {
            linha = 20;
        }

        System.out.print("Digite o tamanho da coluna entre 1 e 20: ");
        int coluna = sc.nextInt();

        if (coluna < 1) {
            coluna = 1;
        } else if (coluna > 20) {
            coluna = 20;
        }

        System.out.println(fazerMoldura(linha, coluna));
        sc.close();
    }


    public static String fazerMoldura(int linha, int coluna) {
        String saida = "";

        for (int a = 0; a < linha; a++) {
            if (a == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (a == (linha - 1)) {
                System.out.print("+");
            }

        }

        for (int b = 0; b < coluna; b++) {
            for (int i = 0; i < linha; i++) {
                if (i == 0) {
                    System.out.print("\n|");
                } else {
                    System.out.print(" ");
                }

                if (i == (linha - 1)) {
                    System.out.print(" |");
                }
            }
        }

        for (int i = 0; i < linha; i++) {
            if (i == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (i == (linha - 1)) {
                System.out.print("+");
            }

        }
        return saida;
    }

} 