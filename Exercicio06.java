import java.util.Scanner;

public class Exercicio06 {
    // Faça um programa que converta da notação de 24 horas 
    // para a notação de 12 horas. Por exemplo, o programa 
    // deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros.
    //  Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída.
    //  Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. 
    //  Assim, a função para efetuar as conversões terá um parâmetro formal para registrar
    //   se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo 
    //   para novos valores de entrada todas as vezes que desejar.

    public static void main(String[] args) throws Exception {
        
        char resposta;
       
        Scanner sc = new Scanner(System.in);  
        do {
          
          System.out.println("Insira o valor das horas: ");
          int horas = sc.nextInt();
          System.out.println("Insira o valor em minutos: ");
          int minutos = sc.nextInt();
          if (horas > 12) {
            horas = horas - 12;
            saida(horas, minutos, 'P');
          } 
          else if (horas == 12) {
            saida(horas, minutos, 'P');
            } 
            else if (horas == 24) {
              horas = 0;
              saida(horas, minutos, 'A');
              } 
              else {
                saida(horas, minutos, 'A');
                }
         System.out.println("Deseja converter novamente?");
          sc.nextLine();
         resposta = sc.nextLine().charAt(0);   
      } while ( resposta != 'n');
      sc.close();
    }
    
      static void saida(int h, int m, char x) {
        System.out.println(h + ":" + m + " " + x + ".M.");
        }
}
