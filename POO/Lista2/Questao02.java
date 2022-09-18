//Escreva um programa para ler um número do usuário. Caso seja positivo, exibir na tela o dobro deste número, ou seu triplo caso seja negativo.

import java.util.Scanner;

public class Questao02{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    double num = sc.nextDouble();

    if (num >= 0){
      num *= 2;
    }
    else{
      num *= 3;   
    }
    System.out.print("Resultado: " + num);
  }
}