//Escreva um programa em Java que receba do usuário os valores do lado do respectivo triângulo:

import java.util.*;
class Questao02{
  public static void main(String[] args){
  Scanner entrada = new Scanner(System.in);
  System.out.print("Digite o valor do cateto 1: ");
  double C1 = entrada.nextDouble();
  System.out.print("Digite o valor do cateto 2: ");
  double C2 = entrada.nextDouble();
  double h;

  h= Math.sqrt(Math.pow(C1,2)+Math.pow(C2,2));
System.out.printf("O valor da hipotenusa é %.2f ", h);
  } 
}
