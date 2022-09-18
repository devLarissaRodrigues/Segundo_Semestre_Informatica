//Escreva um programa em Java que leia os valores da base e altura de um retângulo. Em seguida, exibir na tela o valor do perímetro e área.

import java.util.*;

class Questao01 {
  public static void main(String[] args){

  Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o valor da base do retângulo: ");
    double base = entrada.nextDouble();
    System.out.print("Digite o valor da altura: ");
    double altura = entrada.nextDouble();
    double area;
    double perimetro;
    area = base * altura;
    perimetro = 2*altura + 2*base;
    System.out.printf("O valor do perímetro do retângulo é: %.2f\n", perimetro);
    System.out.printf("O valor da área é %.2f: ", area);
    
  }
}