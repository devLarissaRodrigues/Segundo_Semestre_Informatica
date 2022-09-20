//Faça um programa que receba o salário de um funcionário chamado Jorge. Sabe-se que outro funcionário, Saulo, tem salário equivalente a um terço do salário de Jorge. Jorge aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e Saulo aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e exibir na tela a quantidade de meses necessários para que o valor pertencente a Saulo iguale ou ultrapasse o valor pertencente a Jorge.

import java.util.Scanner;

public class Questao08{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o salário de Jorge: R$ ");
    double salarioJorge = sc.nextDouble();
    double salarioSaulo = salarioJorge/3;
    int contador = 0;

    while (salarioJorge > salarioSaulo){
      salarioJorge += (salarioJorge * 0.02);
      salarioSaulo += (salarioSaulo * 0.05);
      contador += 1;
    }

    // do{
    //   salarioJorge += (salarioJorge * 0.02);
    //   salarioSaulo += (salarioSaulo * 0.05);
    //   contador += 1;
    //   System.out.println(salarioJorge);
    //   System.out.println(salarioSaulo);
    // }while((salarioJorge != salarioSaulo) || (salarioJorge > salarioSaulo));

    System.out.println("Serão necessários " + contador + " meses para o salário de Saulo se igualar ou ultrapassar o salário de Jorge");
  }
}

