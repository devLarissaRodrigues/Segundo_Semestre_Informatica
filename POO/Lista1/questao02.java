//Escreva um programa em Java que leia quatro números inteiros representando as notas de um aluno (Notas do 1°, 2°, 3° e 4° Bimestres). A saída do programa deve ser a média aritméca das notas.

import java.util.Scanner;

class questao02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a primeira nota: ");
    int a = entrada.nextInt();
    System.out.print("Digite a segunda nota: "); 
    int b = entrada.nextInt();
    System.out.print("Digite a terceira nota: ");
    int c = entrada.nextInt();
    System.out.print("Digite a quarta nota: ");
    int d = entrada.nextInt();

    int soma;
    double media;
    
    soma = a + b + c + d;
    media = soma/4;
    System.out.printf("Média: %.2f", media);


  }
}