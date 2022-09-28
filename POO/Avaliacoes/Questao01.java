//nome, sexo, senha, idade, profissão, habilidades

import java.util.Scanner;

public class Questao01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite seu sexo: ");
    String sexo = sc.nextLine();
    String senha;
    System.out.print("Digite sua idade: ");
    int idade = sc.nextInt();
    System.out.print("Digite sua profissão: ");
    String profissao = sc.nextLine();
    System.out.print("Digite suas habilidades: ");
    String habilidades = sc.nextLine();
    int idadeAposentadoria, anoAposentadoria;

    while(true){
      System.out.print("Digite sua senha: ");
      senha = sc.nextLine();
      if (senha.equals("1234")){
        System.out.printf("Seja bem vindo(a), %s, a empresa FACEBOOK. Será um prazer trabalhar com um(a) %s com sua experiência.", nome, profissao);
      if (sexo.toUpperCase().startsWith("M")){
        idadeAposentadoria = 65;
        anoAposentadoria = 2022 + (idadeAposentadoria - idade);
        System.out.printf("\nVocê irá se aposentar em %s\n", anoAposentadoria);
      }
        if (sexo.toUpperCase().startsWith("F")){
        idadeAposentadoria = 60;
        anoAposentadoria = 2022 + (idadeAposentadoria - idade);
        System.out.printf("\nVocê irá se aposentar em %s\n", anoAposentadoria);
      }
        if (habilidades.equals("gosto de ajudar")){
          System.out.printf("Sou proativo".toUpperCase());
        }
        if (habilidades.equals("gosto de trabalhar em grupo")){
          System.out.print("Sou participativo".toUpperCase());
        }          
        break;
      }  
    }
  }
}