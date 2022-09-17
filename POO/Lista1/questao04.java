//Escreva um programa em Java que leia o valor da base e da altura de um triângulo e em seguida imprima na tela o valor de sua área. Lembrando que a fórmula da área é: A = (B x H)/2
import java.util.Scanner;

class questao04{
  public static void main(String[] args){

    //entrada
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a base: ");
    float base = entrada.nextFloat();
    System.out.print("Digite a Altura: ");
    float altura =entrada.nextFloat();
    float area;


    //processamento
    area = (base * altura)/2;

    //saída
    System.out.print("O valor da area é:" +area);

    
    
  }
  
}