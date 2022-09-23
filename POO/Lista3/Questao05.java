//Faça um programa que recebe de entrada duas Strings e compare se elas são iguais. O programa deve considerar maiúsculas e minúsculas. Caso sejam iguais, exiba na tela a mensagem "Strings Iguais". Caso contrário, exibir na tela a mensagem "Strings Diferentes"

import java.util.Scanner;

public class Questao03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um nome: ");
    String nome1 = sc.nextLine();
    System.out.print("Digite outro nome: ");
    String nome2 = sc.nextLine();
    
    if(nome1.equals(nome2)){
      System.out.print("Strings iguais.");
    }
    else{
      System.out.print("Strings Diferentes");
    }
  }
}