//Escreva um programa para ler 2 valores inteiros (considere que não serão lidos valores iguais) e informar na tela o maior dos números.

import java.util.Scanner;

public class Questao01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    double num1 = sc.nextDouble();
    System.out.print("Digite outro número: ");
    double num2 = sc.nextDouble();

    if (num1 > num2){
      System.out.println("O número " + num1 + " é maior que o número " + num2);      
    }
    else{
      System.out.print("O número " + num2 + " é maior que o número " + num1);
    }
  }
  
}