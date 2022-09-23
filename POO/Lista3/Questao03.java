//Faça um programa que recebe de entrada uma String e verifica se o valor digitado começa com "Ana". Em caso afirmativo, imprimir na tela "Ana está presente", caso negativo "Ana não foi encontrada".

import java.util.Scanner;

public class Questao03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um nome: ");
    String entrada = sc.nextLine().toUpperCase();

    if(entrada.startsWith("ANA")){
      System.out.println("Ana está presente");
    }
    else{
      System.out.print("Ana não foi encontrada");
    }
  }
}