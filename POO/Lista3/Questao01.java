//Faça um programa que recebe três Strings de entrada: nome, cidade e curso. No final, o programa exibe na tela a seguinte mensagem: "Seja bem vindo X ao IFPB, o aluno é da cidade Y e foi aprovado para o curso Z". Onde X, Y e Z são respectivamente o nome, cidade e curso digitado pelo usuário.

import java.util.Scanner;

public class Questao03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite sua cidade: ");
    String cidade = sc.nextLine();
    System.out.print("Digite seu curso: ");
    String curso = sc.nextLine();

    System.out.print("Seja bem vindo(a), " + nome + " ao IFPB. O(a) aluno(a) é da cidade " + cidade + " e foi aprovado(a) para o curso: " + curso);
  }
}

  