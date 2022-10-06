//Crie estaticamente um array de dez números inteiros. Depois imprima na tela o terceiro valor do Array.

import java.util.Scanner;

public class Questao01{
  public static void main(String[] args){
    int [] lista = new int[10];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < lista.length; i++){
      System.out.print("Digite um número: ");
      int numero = sc.nextInt();
      lista[i] = numero;
    }
    System.out.print("O terceiro valor do array é " + lista[2]);
  }
}
