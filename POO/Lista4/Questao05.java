//Escreva um programa que lê 10 valores numéricos digitados pelo usuário e armazena em um array. Depois o programa deve informar quantos dos números informados são pares.

import java.util.Scanner;

public class Questao05{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] lista = new int[10];
    int pares = 0;

    for(int i=0; i<lista.length;i++){
      System.out.print("Digite um número: ");
      int numero = sc.nextInt();
      lista[i] = numero;
      if(lista[i] % 2 == 0){
        pares += 1;
      }
    }
    System.out.printf("Foram digitados %d números pares", pares);
  }
}