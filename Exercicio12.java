import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Exercicio12 {

    //  Embaralha palavra. Construa uma função que receba uma string como parâmetro
    //  e devolva outra string com os carateres embaralhados. 
    //  Por exemplo: se função receber a palavra python, pode retornar npthyo, 
    //  ophtyn ou qualquer outra combinação possível, de forma aleatória. 
    //  Padronize em sua função que todos os caracteres serão devolvidos em caixa alta ou caixa baixa, 
    //  independentemente de como foram digitados.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite alguma palavra: ");
        String palavra = sc.nextLine();
        List<String> embaralhar = Arrays.asList(palavra.split(""));
        System.out.println(embaralhaPalavra(embaralhar, palavra));
        sc.close();
    }

    public static String embaralhaPalavra(List<String> embaralharpalavra, String palavra) {
        Collections.shuffle(embaralharpalavra);
        StringBuilder out = new StringBuilder(palavra.length());

        out.append("A String embaralhada ficará assim: ");

        for (String a : embaralharpalavra) {
            out.append(a);
        }

        return out.toString();
    }

   
}