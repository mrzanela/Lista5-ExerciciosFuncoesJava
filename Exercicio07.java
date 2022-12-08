import java.util.Scanner;

public class Exercicio07 {
    // Faça um programa que use a função valorPagamento para determinar o valor a 
    // ser pago por uma prestação de uma conta. O programa deverá solicitar ao usuário
    // o valor da prestação e o número de dias em atraso e passar estes valores para a 
    // função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao 
    // programa que a chamou. O programa deverá então exibir o valor a ser pago na tela.
    // Após a execução o programa deverá voltar a pedir outro valor de prestação e assim 
    // continuar até que seja informado um valor igual a zero para a prestação. Neste momento 
    // o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade 
    // e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito da seguinte forma.
    // Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver atraso, cobrar 3% de multa,
    // mais 0,1% de juros por dia de atraso.

    public static void main(String[] args) throws Exception {
	    
	    int diasDeAtraso;
	    double valorDaPrestacao;
	    double total=0;
	    int i =1;
	    Scanner sc = new Scanner(System.in);  
	    do { 
	      System.out.println("Insira o valor do seu "+i+"o. pagamento: ");
	      valorDaPrestacao = sc.nextDouble();
	      if (valorDaPrestacao==0) {
	    	  break;
	      }
	      System.out.println("Insira a quantidade de dias em atraso: ");
	      diasDeAtraso = sc.nextInt();
	      total+=valorPagamento(valorDaPrestacao,diasDeAtraso);
	      System.out.println("Valor a ser pago: " +valorPagamento(valorDaPrestacao,diasDeAtraso));        
	      System.out.println("\n\n");
	     i++;
	    } while ( valorDaPrestacao !=0);
	    System.out.println("\nRelatório do dia: "+total);
	    sc.close();
	  }
	
	static double valorPagamento(double valorDaPrestacao, int diasDeAtraso) {
		double valorASerPago;
	  if(diasDeAtraso >0){
	    valorASerPago = (valorDaPrestacao*103/100) + (valorDaPrestacao*diasDeAtraso*1/1000); 
	    return valorASerPago;
	    }
	  else {
	    valorASerPago = valorDaPrestacao;
	    return valorASerPago;
	  }
  }
}
