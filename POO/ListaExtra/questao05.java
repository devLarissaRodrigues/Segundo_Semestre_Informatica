//Faça um programa em JAVA para calcular o valor final de financiamento de um imóvel. Para isso você precisará calcular os juros compostos (fórmula ). Onde M: montante final, C: capital inicial, i: taxa fixa, t: período de tempo. O programa deve receber esses parâmetros e retornar o valor final pago pelo financiamento. 

import java.lang.Math;
import java.util.Scanner;

class questao05{
  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o capital inicial: R$ ");
    double capital = entrada.nextDouble();
    System.out.print("Digite a taxa fixa em porcentagem: ");
    double taxa = entrada.nextDouble();
    System.out.print("Digite o período de tempo: ");
    double tempo = entrada.nextDouble();
 
    double montante = capital * Math.pow((1+taxa),tempo);
    System.out.printf("O valor final do financiamento do imóvel é de R$ %.2f", montante);
    
  }
}