//Crie um array de cinco nomes de pessoas. Depois verifique se o nome “ANA” faz parte do Array. Em caso afirmativo exibir na tela a mensagem “SUCESSO”. E mostre a mensagem “FRACASSO” caso contrário.

import java.util.Scanner;

public class Questao03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String [] lista = new String[5];
    int contador = 0;

    for (int i=0; i<lista.length; i++){
      System.out.print("Digite um nome: ");
      String nome = sc.nextLine();
      lista[i] = nome;           
    }
    for (int i=0; i<lista.length; i++){
      if(lista[i].toUpperCase().contains("ANA")){
        contador += 1;
        break;
      }
    }
    if (contador >= 1){
      System.out.print("SUCESSO");
      }
    else{
      System.out.print("FRACASSO");
      }
    }
  }
