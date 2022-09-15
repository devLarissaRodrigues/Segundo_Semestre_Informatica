//Escreva um programa em Java que leia os valores da base e altura de um retângulo. Em seguida, exibir na tela o valor do perímetro e área.

import java.util.*;

class questao01 {
  public static void main(String[] args){

  Scanner entrada = new Scanner(System.in);
    System.out.print("Digite sua base: ");
    double base = entrada.nextDouble();
    System.out.print("Digite sua altura: ");
    double altura = entrada.nextDouble();
    double area;
    double perimetro;
    area = base * altura;
    perimetro = 2*altura + 2*base;
    System.out.println("O valor do perímetro é: "+perimetro);
    System.out.print("O valor da área é: "+area);
    
  }
}