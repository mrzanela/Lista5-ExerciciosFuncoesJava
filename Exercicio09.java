import java.util.Scanner;

public class Exercicio09  {
    // Reverso do número. Faça uma função que retorne o reverso
    // de um número inteiro informado. Por exemplo: 127 -> 721.

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que será invertido");
        int numero = sc.nextInt();
        String s = Integer.toString(numero);
        System.out.println("O número invertido é: "+inverterNumero(s));
        sc.close();
    } 
    public static String inverterNumero(String s){
      int i,n;
      n = s.length();
      String sAux = "";
      for(i=(n-1);i>=0;i--){
        sAux= sAux + s.charAt(i);
      }
      return sAux;
    }
}