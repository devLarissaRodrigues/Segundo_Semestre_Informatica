//Escreva um programa que recebe do usuário a informação de um LOGIN e SENHA. O valor de senha correto é "12345”, caso o usuário informe o valor correto, exibir na tela "Parabéns” + LOGIN + "senha correta!". Caso contrário, exibir "Cuidado, senha incorreta" e solicitar novamente os valores de LOGIN e SENHA.

import java.util.Scanner;

public class Questao06{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu login: ");
    String login = sc.nextLine();
    String senha = "teste";

    while(true){
      System.out.print("Digite sua senha: ");
      senha = sc.nextLine();
      if (senha.equals("12345")){
        System.out.print("Parabéns, " + login + "! Senha correta.");
        break;
      }
      else{
        System.out.print("Cuidado! Senha incorreta!\n");
      }
    } 
  }
}
