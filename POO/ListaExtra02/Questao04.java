//Escreve um programa em Java que leia o ano de nascimento do usuário. O ano precisa ser obrigatoriamente um valor entre 1900 e 2022. Se a pessoa digitar um número fora desse intervalo, mostrar a mensagem: "entrada inválida" e solicitar o número novamente. Se digitar corretamente, mostrar o número digitado.

import java.util.Scanner;

public class Questao04{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ano;
    
    while(true){
      System.out.print("Digite o ano do seu nascimento: ");
      ano = sc.nextInt();
      if (ano >= 1900 && ano <= 2022){
        System.out.print("Entrada válida. O ano digitado foi " + ano);
        break;
      }
      else{
        System.out.print("Entrada inválida\n");
      }
    }
  }
}

