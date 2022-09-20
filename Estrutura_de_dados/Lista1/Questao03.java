// Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a tabela a seguir, verifique e mostre em qual grupo de risco (1 a 9) essa pessoa se encaixa. 

import java.util.*;

public class Questao03{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = entrada.nextInt();
    System.out.print("Digite seu peso: ");
    double peso = entrada.nextDouble();
    int risco = 0; 

    if (idade <= 20 && peso <= 60.0){
      risco = 9;
    }
    else if (idade <= 20 && peso > 60.0 && peso <= 90.0){
      risco = 8;
    }
    else if (idade <= 20 && peso > 90.0){
      risco = 7;
    }
     else if (idade >= 21 && idade <= 50 && peso <= 60.0){
      risco = 6;
    }
    else if (idade >= 21 && idade <= 50 && peso > 60.0 && peso <= 90.0){
      risco = 5;
    }
    else if (idade >= 21 && idade <= 50.0 && peso > 90.0){
      risco = 4;
    }
    else if (idade > 50 && peso <= 60.0){
      risco = 3;
    }
    else if (idade > 50 && peso > 60.0 && peso <= 90.0){
      risco = 2;
    }
    else{
      risco = 1;
    }
     
  System.out.print("Você faz parte do grupo de risco: " + risco);
    
  }
}