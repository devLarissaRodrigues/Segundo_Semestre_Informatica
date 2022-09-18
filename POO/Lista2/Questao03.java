//As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;

public class Questao03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double preco;

    System.out.print("Digite a quantidade de maças: ");
    int macas = sc.nextInt();

    if (macas < 12){
      preco = macas * 0.3;
    }
    else{
      preco = macas * 0.25;
    }
    System.out.printf("O valor total a ser pago é R$ %.2f", preco);
  }
}