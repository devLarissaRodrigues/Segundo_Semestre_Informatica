//nome, sexo, senha, idade, profissão, habilidades

import java.util.Scanner;

public class Questao01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String senha, nome, sexo, profissao, habilidades;
    int idade, idadeAposentadoria, anoAposentadoria;

    while(true){
      System.out.print("Digite sua senha: ");
      senha = sc.nextLine();
      
      if (senha.equals("1234")){
        System.out.print("SENHA CORRETA!\n");
        System.out.print("\n---------CADASTRO---------\n");
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        
        System.out.print("Digite seu sexo: ");
        sexo = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Digite sua profissão: ");
        profissao = sc.nextLine();
        
        System.out.print("Digite suas habilidades: ");
        habilidades = sc.nextLine(); 
        
        System.out.printf("Seja bem vindo(a), %s, a empresa FACEBOOK. Será um prazer trabalhar com um %s com sua experiência.\n", nome, profissao);

        if(sexo.toUpperCase().startsWith("M")){
          idadeAposentadoria = 65;
          anoAposentadoria = 2022 + (idadeAposentadoria - idade);
          System.out.printf("\nVocê irá se aposentar em %s\n", anoAposentadoria);
        }
        else if(sexo.toUpperCase().startsWith("F")){
          idadeAposentadoria = 60;
          anoAposentadoria = 2022 + (idadeAposentadoria - idade);
          System.out.printf("\nVocê irá se aposentar em %s\n", anoAposentadoria);
        }
        if (habilidades.equals("gosto de ajudar")){
          System.out.printf("Sou proativo".toUpperCase());
        }
        else if (habilidades.equals("gosto de trabalhar em grupo")){
          System.out.print("Sou participativo".toUpperCase());
        }          
        break;
      }
      else{
        System.out.println("Você digitou a senha incorreta!");
      }
    }
  }
}

  
