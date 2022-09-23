//Faça um programa que recebe de entrada uma String referente a o nome completo do cliente. O programa deve substituir o termo "Medeiros" por "Siqueira" caso faça parte do nome digitado pelo usuário

import java.util.Scanner;

public class Questao03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu nome completo: ");
    String nome = sc.nextLine().toUpperCase();

    if (nome.contains("MEDEIROS")){
      System.out.println(nome.replace("MEDEIROS", "Siqueira"));
    }
  }
}
