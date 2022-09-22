//Escreva um programa em Java que receba do usuário os valores do lado do triângulo retângulo
import java.util.Scanner;

public class Questao04{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor do cateto 1: ");
    double cateto1 = sc.nextDouble();
    System.out.print("Digite o valor do cateto 2: ");
    double cateto2 = sc.nextDouble();
    System.out.print("Digite o valor da hipotenusa: ");
    double hipotenusa = sc.nextDouble();

    double senoTheta = cateto1/hipotenusa;
    double cossenoTheta = cateto2/hipotenusa;
    double senoBeta = cossenoTheta;
    double cossenoBeta = senoTheta;

    System.out.printf("O seno de Theta é igual ao cosseno de Beta e seu valor é %.2f\n", senoTheta);
    System.out.printf("O seno de Beta é igual ao cosseno de Theta e seu valor é: %.2f ", cossenoTheta);
  }
}