//Escreva um programa que recebe 5 nomes de pessoas e suas idades. Vocês devem armazenar essas informações em dois Arrays. No final, imprimir na tela o nome da pessoa com maior idade.

import java.util.*;
public class Questao07{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String [] nomes = new String[5];
    int [] idades = new int[5];
    String nome;
    int idade;
    int maiorIdade = 0;
    int indice = 0;
    int i;

    for(i=0; i<nomes.length; i++){
      System.out.print("Digite seu nome: ");
      nome = sc.nextLine();
      nomes[i] = nome;
      System.out.print("Digite sua idade: ");
      idade = sc.nextInt();
      String erro = sc.nextLine();
      idades[i] = idade;
      System.out.print("\n");

      if(i==0 || idades[i] > maiorIdade){
        maiorIdade = idades[i];
        indice = i;
      }
    }
      System.out.printf("A pessoa com maior idade é %s, com %d anos", nomes[indice], idades[indice]);
  }
}