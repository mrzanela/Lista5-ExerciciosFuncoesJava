import java.util.Random;

public class Exercicio10 {
    // Jogo de Craps. Faça um programa de implemente um jogo de Craps. 
    // O jogador lança um par de dados, obtendo um valor entre 2 e 12. 
    // Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. 
    // Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu. 
    // Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". 
    // Seu objetivo agora é continuar jogando os dados até tirar este número novamente. 
    // Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.

    public static void main(String[] args) throws Exception {
        int valorPonto = calculaDados();
        if (valorPonto == 7 || valorPonto == 11) {
            System.out.println("A soma dos dados foi: " + valorPonto + " Você é um Natural! VOCÊ GANHOU");
        } 
        else if (valorPonto == 2 || valorPonto == 3 || valorPonto == 12) {
            System.out.println("A soma dos dados foi: " + valorPonto + " CRAPS! VOCÊ PERDEU.");
        } 
        else if ((valorPonto == 4 || valorPonto == 5 || valorPonto == 6 || valorPonto == 8 || valorPonto == 9
                || valorPonto == 10)) {
            System.out.println("A soma dos dados foi: " + valorPonto + " Você marcou PONTO! TIRE O MESMO NÚMERO "
                    + valorPonto + " novamente para vencer!");
            while (valorPonto != 7) {
                int valor2 = calculaDados();
                if (valorPonto == valor2) {
                    System.out.println("Você tirou " + valor2 + " VOCÊ GANHOU!");
                    break;
                } else if (valor2 == 7) {
                    System.out.println("Você tirou " + valor2 + " VOCÊ PERDEU!");
                    break;
                }
                System.out.println("Você tirou " + valor2 + " tente tirar " + valorPonto + " para ganhar.");
            }

        }
    }

    static int calculaDados() {
        Random dado1 = new Random();
        int numA = dado1.nextInt(6) + 1;

        Random dado2 = new Random();
        int numB = dado2.nextInt(6) + 1;

        int soma = numA + numB;
        return soma;
    }
}