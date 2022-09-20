//Faça um programa para apresentar todos os números da sequência a seguir: 0.00, 0.25, 0.50, 0.75, 1.00, 1.25, 1.50, 1.75, 2.00, 2.25, 2.50, 2.75, 3.00, 3.25, 3.50, 3.75, 4.00.

public class Questao02{
  public static void main(String[] args){

    for (double i=0; i<=4; i+=0.25){
      System.out.printf("%.2f ", i);
    }
  }
}
