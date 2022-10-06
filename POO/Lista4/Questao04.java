//Escreva um programa que lê 10 valores numéricos digitados pelo usuário e armazena em um array. Depois o programa deve percorrer a estrutura e imprimir na tela o MAIOR e MENOR destes valores.

import java.util.Scanner;

public class Questao04{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] lista = new int[10];
    int maior = 0;
    int menor = 0;

    for (int i=0; i<lista.length; i++){
      System.out.print("Digite um número: ");
      int numero = sc.nextInt();
      lista[i] = numero;

      if(i == 0 || maior < numero){
        maior = numero;
      }
      if(i == 0 || menor > numero){
        menor = numero;
      }
    }
    System.out.println("O maior número digitado foi " + maior);
    System.out.print("O menor número digitado foi " + menor);
  }
}