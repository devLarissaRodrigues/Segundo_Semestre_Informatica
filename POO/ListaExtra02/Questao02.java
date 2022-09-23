//Escreva um programa em Java que leia um valor inteiro do usuário e imprima na tela a tabuada de 1 a 10 do valor lido.

import java.util.Scanner;

public class Questao02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = sc.nextInt();
    System.out.println("\nTABUADA DE " + num + ":\n");

    for(int i=1; i<=10; i++){
      System.out.println(num + " x " + i + " = " + num*i);
    }
  }
}