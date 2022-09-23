//Escreva um programa em Java que leia 10 números inteiros e imprima na tela quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class Questao05{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    int contador_pares = 0;
    int contador_impares = 0;

    for(int i=0; i<10;i++){
      System.out.print("Digite um número: ");
      num = sc.nextInt();
      if(num % 2 == 0){
        contador_pares += 1;
      }
    }
    contador_impares = 10 - contador_pares;
    System.out.println("Foram digitados " + contador_pares + " números pares e " + contador_impares + " números ímpares");
  } 
}