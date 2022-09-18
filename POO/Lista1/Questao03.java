//Escreva um programa em Java que leia dois números da entrada A e B. Depois o programa deve exibir na tela o valor de AxB, Raiz de A e Raiz de B:

import java.util.Scanner;

class Questao03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    double num1 = sc.nextDouble();
    System.out.print("Digite mais um número: ");
    double num2 = sc.nextDouble();

    System.out.printf("A x B = %.2f\n", (num1*num2));
    System.out.printf("Raiz de A = %.2f\n", (Math.sqrt(num1)));
    System.out.printf("Raiz de B = %.2f", (Math.sqrt(num2)));
    
  }
}


