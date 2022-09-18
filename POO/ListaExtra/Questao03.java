//Escreva um programa que leia do usuário o seu nome e as quatro notas bimestrais. O programa deve calcular a média aritméca das notas. Em seguida, exibir na tela a mensagem: “Resultado final do aluno ” + nome + “. Obteve nota final: ” + média.

import java.util.*;
class Questao03 {
  public static void main(String[] args){

  Scanner entrada = new Scanner (System.in);
  System.out.print("Digite sua primeira nota: ");  
  double num1= entrada.nextDouble();
  System.out.print("Digite sua segunda nota: ");  
  double num2= entrada.nextDouble();
  System.out.print("Digite sua terceira nota: ");  
  double num3= entrada.nextDouble();
  System.out.print("Digite sua quarta nota: ");  
  double num4= entrada.nextDouble(); 
    
  double media = (num1 + num2 + num3 + num4)/4;
  System.out.printf("Média: %.2f", media);
    
  }
  
}