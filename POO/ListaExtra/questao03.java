//Escreva um programa que leia do usuário o seu nome e as quatro notas bimestrais. O programa deve calcular a média aritméca das notas. Em seguida, exibir na tela a mensagem: “Resultado final do aluno ” + nome + “. Obteve nota final: ” + média.

import java.util.*;
class questao03 {
  public static void main(String[] args){

  Scanner entrada = new Scanner (System.in);
  System.out.print("Digite sua primeira nota: ");  
  double N1= entrada.nextDouble();
  System.out.print("Digite sua segunda nota: ");  
    double N2= entrada.nextDouble();
  System.out.print("Digite sua terceira nota:");  
    double N3= entrada.nextDouble();
  System.out.print("Digite sua quarta nota: ");  
    double N4= entrada.nextDouble(); 
    
    double Media = (N1 + N2 + N3 + N4)/4;
    System.out.print("Média: "+ Media);
    
  }
  
}