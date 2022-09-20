//Escreva um programa em Java que calcule o valor de H, sendo que ele é determinado pela série a seguir: H = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50

public class Questao06{
  public static void main(String[] args){
    double contador = 0;
    double soma = 0;

    for (int i=1; i<= 99; i+=2){
      contador += 1;
      soma += i/contador;
    }
    System.out.printf("A soma da série H é: %.2f", soma);   
  }
}
