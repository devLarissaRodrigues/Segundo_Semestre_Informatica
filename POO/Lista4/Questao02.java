//Crie estaticamente um array de dez números inteiros. Depois imprima na tela a soma dos valores armazenados.

import java.util.*;

public class Questao02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] lista = new int[10];
    int soma = 0;

    for (int i = 0; i < 10; i++){
      System.out.print("Digite um número: ");
      int numero = sc.nextInt();
      lista[i] = numero; 
      soma += numero;
    }
    System.out.print("A soma dos números digitados é: " + soma);
    
  }
}